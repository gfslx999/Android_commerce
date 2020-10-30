package com.lx.android_commerce.mvp.view.fragment;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.android_commerce.ui.DarkPayActivity;
import com.lx.android_commerce.weight.adapter.ShopCarAdapter;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.android_commerce.weight.entity.GreenShop;
import com.lx.lib_core.mvp.view.BaseFragment;
import com.lx.lib_core.weight.utils.LogUtil;
import com.zhy.autolayout.AutoRelativeLayout;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 11:20
 *@params : 
 *@description:
 */
@SuppressLint("HandlerLeak")
class ShopCarFragment extends BaseFragment {

    @BindView(R.id.fra_shop_car_set)
    TextView fraShopCarSet;
    @BindView(R.id.fra_shop_car_rv)
    RecyclerView fraShopCarRv;
    @BindView(R.id.fra_shop_car_tv_loading)
    TextView fraShopCarTvLoading;
    @BindView(R.id.fra_shop_car_check_all)
    CheckBox fraShopCarCheckAll;
    @BindView(R.id.fra_shop_car_bottom_rl)
    AutoRelativeLayout fraShopCarBottomRl;
    @BindView(R.id.fra_shop_tv_allMoney)
    TextView fraShopTvAllMoney;
    @BindView(R.id.fra_shop_car_tv_all)
    TextView fraShopCarTvAll;
    @BindView(R.id.fra_shop_tv_all_text)
    TextView fraShopTvAllText;
    @BindView(R.id.fra_shop_car_btn_clear)
    Button fraShopCarBtnClear;

    private ShopCarAdapter mShopCarAdapter;
    private List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> mShopCarGoodsList = new ArrayList<>();

    private double allMoney = 0.0;

    @Override
    public int bindLayout() {
        return R.layout.fragment_shopcar;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void initView() {

        mShopCarAdapter = new ShopCarAdapter(R.layout.item_shop_car_layout, mShopCarGoodsList);
        fraShopCarRv.setAdapter(mShopCarAdapter);
        fraShopCarRv.setLayoutManager(new LinearLayoutManager(getContext()));
        //设置删除动画
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setRemoveDuration(800);
        fraShopCarRv.setItemAnimator(defaultItemAnimator);
        //添加RV滑动监听
        fraShopCarRv.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (oldScrollY >= 0) {
                    fraShopCarBottomRl.setVisibility(View.VISIBLE);
                } else {
                    fraShopCarBottomRl.setVisibility(View.GONE);
                }
            }
        });

        //子控件点击事件
        mShopCarAdapter.setOnItemChildClickListener((adapter, view, position) -> {
            //显示底部
            if (position != mShopCarGoodsList.size() - 1)
                fraShopCarBottomRl.setVisibility(View.VISIBLE);

            GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean = mShopCarGoodsList.get(position);
            switch (view.getId()) {
                case R.id.item_shop_car_iv_add:
                    int shopCarNum = goodsDetailsBean.getShopCarNum();
                    goodsDetailsBean.setShopCarNum(++shopCarNum);
                    break;
                case R.id.item_shop_car_iv_subtract:
                    int subtractShopCarNum = goodsDetailsBean.getShopCarNum();
                    if (subtractShopCarNum > 0) {
                        goodsDetailsBean.setShopCarNum(--subtractShopCarNum);
                    } else showToast("最少添加亿个哦");
                    break;
                case R.id.item_shop_car_checked:
                    boolean checked = goodsDetailsBean.isChecked();
                    goodsDetailsBean.setChecked(!checked);
                    break;
                case R.id.item_shop_car_iv_remove:
                    //弹出提示框
                    showAlertDialog(position);
                    break;
            }
            //刷新适配器
            mShopCarAdapter.notifyDataSetChanged();
            //计算总价
            countAllMoney();
            //更改数据库中的购物车商品信息
            String json = new Gson().toJson(goodsDetailsBean);
            MyApp.getInstance().getDaoSession().getGreenShopDao().update(new GreenShop(goodsDetailsBean.getGreenProductId(), json));
        });

        EventBus.getDefault().register(this);   //注册EventBus
        readLocalData();    //读取本地数据
        countAllMoney();    //进入页面就计算总价
    }

    private void showAlertDialog(int position) {
        new AlertDialog.Builder(Objects.requireNonNull(getContext()))
                .setTitle("提示")
                .setMessage("您是否要删除该商品")
                .setIcon(R.mipmap.tongkumao)
                .setNegativeButton("取消", null)
                .setPositiveButton("确认", (dialog, which) -> {
                    if (mShopCarGoodsList.size() <= 1) {
                        mShopCarGoodsList.clear();
                        mShopCarAdapter.notifyDataSetChanged();
                        MyApp.getInstance().getDaoSession().getGreenShopDao().deleteAll();
                        //刷新页面状态
                        fraShopCarRv.setVisibility(View.GONE);
                        fraShopCarTvLoading.setVisibility(View.VISIBLE);
                        fraShopCarTvAll.setText("全选");
                        fraShopCarCheckAll.setChecked(false);
                    } else {
                        mShopCarGoodsList.remove(position);
                        mShopCarAdapter.notifyItemRemoved(position);
                        //删除数据库中对应的数据
                        MyApp.getInstance().getDaoSession().getGreenShopDao().deleteByKey(mShopCarGoodsList.get(position).getGreenProductId());
                    }
                }).show();
    }

    //计算商品总价
    @SuppressLint("SetTextI18n")
    private void countAllMoney() {
        allMoney = 0;
        for (GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean : mShopCarGoodsList) {
            if (goodsDetailsBean.isChecked()) {
                double singlePrice = (double) goodsDetailsBean.getMin_group_price() * goodsDetailsBean.getShopCarNum();
                allMoney += singlePrice / 100;
            }
        }
        String price = doubleToString(allMoney);
        fraShopTvAllMoney.setText("¥" + price + "元");
    }

    public static String doubleToString(double num) {
        //使用0.00不足位补0，#.##仅保留有效位
        return new DecimalFormat("0.00").format(num);
    }

    //读取本地商品数据
    private void readLocalData() {
        //清空之前的数据
        if (mShopCarGoodsList.size() > 0) mShopCarGoodsList.clear();

        List<GreenShop> greenShops = MyApp.getInstance().getDaoSession().getGreenShopDao().loadAll();
        if (greenShops.size() > 0) {
            for (int i = greenShops.size() - 1; i >= 0; i--) {
                GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean = new Gson().fromJson(greenShops.get(i).getShop(), GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean.class);
                //将商品ID存入集合
                goodsDetailsBean.setShowRemove(false);
                goodsDetailsBean.setGreenProductId(greenShops.get(i).getId());
                mShopCarGoodsList.add(goodsDetailsBean);
            }
            mShopCarAdapter.notifyDataSetChanged();
            //判断是否显示列表
            fraShopCarRv.setVisibility(View.VISIBLE);
            fraShopCarTvLoading.setVisibility(View.GONE);
        } else {
            fraShopCarRv.setVisibility(View.GONE);
            fraShopCarTvLoading.setVisibility(View.VISIBLE);
        }
    }

    @SuppressLint("SetTextI18n")
    @Subscribe
    public void eventReceive(String msg) {
        if (msg.equals("It's time to refresh")) {
            readLocalData();
        } else if (msg.equals("pay result is success")) {
            //TODO 将其添加到待收货列表中
            List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> deliveryList = new ArrayList<>();

            //删除购物车中对应的商品
            for (int i = 0; i < mShopCarGoodsList.size(); i++) {
                if(mShopCarGoodsList.get(i).isChecked()) {
                    //删除数据库中对应的商品
                    MyApp.getInstance().getDaoSession().getGreenShopDao().deleteByKey(mShopCarGoodsList.get(i).getGreenProductId());
                }
            }
            readLocalData();
            fraShopTvAllMoney.setText("¥" + 0.00 + "元");
            fraShopCarCheckAll.setChecked(false);
            fraShopCarTvAll.setText("全选");
        }
    }

    @SuppressLint("SetTextI18n")
    @OnClick({R.id.fra_shop_car_set, R.id.fra_shop_car_check_all, R.id.fra_shop_car_btn_clear})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fra_shop_car_set:
                changePageState();
                break;
            case R.id.fra_shop_car_check_all:
                //全选
                for (GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean : mShopCarGoodsList) {
                    goodsDetailsBean.setChecked(fraShopCarCheckAll.isChecked());
                }
                mShopCarAdapter.notifyDataSetChanged();
                countAllMoney();
                if (fraShopCarCheckAll.isChecked()) {
                    fraShopCarTvAll.setText("全不选");
                    if (fraShopCarSet.getText().equals("取消")) {
                        fraShopCarBtnClear.setEnabled(true);
                        fraShopCarBtnClear.setBackgroundColor(Color.parseColor("#FF0000"));
                        fraShopCarBtnClear.setText("清空小车");
                    }
                } else if (fraShopCarTvAll.getText().equals("全不选")) {
                    fraShopCarTvAll.setText("全选");
                    if(fraShopCarSet.getText().equals("取消")) {
                        fraShopCarBtnClear.setBackgroundColor(Color.parseColor("#8A0F0F"));
                        fraShopCarBtnClear.setEnabled(false);
                    }
                }
                break;
            case R.id.fra_shop_car_btn_clear:
                if (fraShopCarBtnClear.getText().equals("清空小车") && mShopCarGoodsList.size() > 0) {
                    new AlertDialog.Builder(Objects.requireNonNull(getContext()))
                            .setTitle("警告")
                            .setMessage("您是否要删除全部商品")
                            .setIcon(R.mipmap.tongkumao)
                            .setNegativeButton("取消", null)
                            .setPositiveButton("确认", (dialog, which) -> {
                                mShopCarGoodsList.clear();
                                mShopCarAdapter.notifyDataSetChanged();
                                //删除数据库中对应的数据
                                MyApp.getInstance().getDaoSession().getGreenShopDao().deleteAll();
                                //刷新页面状态
                                fraShopTvAllMoney.setText("¥0.00元");
                                fraShopCarRv.setVisibility(View.GONE);
                                fraShopCarTvLoading.setVisibility(View.VISIBLE);
                                fraShopCarTvAll.setText("全选");
                                fraShopCarCheckAll.setChecked(false);
                            }).show();
                } else {
                    boolean flag = false;
                    for (GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean : mShopCarGoodsList) {
                        if (goodsDetailsBean.isChecked()) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) showToast("至少选中一个商品哦");
                    else {
                        //进入支付宝支付
                        Intent intent = new Intent(getContext(), DarkPayActivity.class);
                        String s = doubleToString(allMoney);
                        double price = Double.parseDouble(s);
                        intent.putExtra("allMoney", price);
                        startActivity(intent);
                    }

                }
                break;
        }
    }

    private void changePageState() {
        if (fraShopCarSet.getText().equals("管理")) {
            fraShopCarSet.setText("取消");
            fraShopTvAllText.setVisibility(View.GONE);
            fraShopTvAllMoney.setVisibility(View.GONE);

            if (fraShopCarCheckAll.isChecked()) {
                fraShopCarBtnClear.setBackgroundColor(Color.parseColor("#FF0000"));
                fraShopCarBtnClear.setText("清空小车");
                fraShopCarBtnClear.setEnabled(true);
            } else {
                fraShopCarBtnClear.setEnabled(false);
                fraShopCarBtnClear.setBackgroundColor(Color.parseColor("#8A0F0F"));
                fraShopCarBtnClear.setText("清空小车");
            }

            //显示item中删除按钮
            for (GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean : mShopCarGoodsList) {
                goodsDetailsBean.setShowRemove(true);
            }
        } else {
            fraShopCarBtnClear.setEnabled(true);
            fraShopCarSet.setText("管理");
            fraShopTvAllText.setVisibility(View.VISIBLE);
            fraShopTvAllMoney.setVisibility(View.VISIBLE);
            fraShopCarBtnClear.setText("结算");
            fraShopCarBtnClear.setBackgroundResource(R.drawable.shape_shop_car_btn_clear);
            for (GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean : mShopCarGoodsList) {
                goodsDetailsBean.setShowRemove(false);
            }
        }
        mShopCarAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}
