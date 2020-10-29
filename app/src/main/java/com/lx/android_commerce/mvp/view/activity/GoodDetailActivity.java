package com.lx.android_commerce.mvp.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.android_commerce.di.component.DaggerGoodDetailComponent;
import com.lx.android_commerce.di.modules.GoodDetailModule;
import com.lx.android_commerce.mvp.contract.GoodDetailContract;
import com.lx.android_commerce.mvp.presenter.GoodDetailPresenter;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.android_commerce.weight.entity.GreenShop;
import com.lx.lib_core.mvp.view.BaseActivity;
import com.lx.lib_core.weight.utils.GlideUtil;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;
import com.zhy.autolayout.AutoLinearLayout;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GoodDetailActivity extends BaseActivity<GoodDetailPresenter> implements GoodDetailContract.View {

    @BindView(R.id.act_good_detail_banner)
    Banner actGoodDetailBanner;
    @BindView(R.id.act_good_detail_btn_back)
    ImageView actGoodDetailBtnBack;
    @BindView(R.id.act_good_detail_tv_min_price)
    TextView actGoodDetailTvMinPrice;
    @BindView(R.id.act_good_detail_tv_normal_price)
    TextView actGoodDetailTvNormalPrice;
    @BindView(R.id.act_good_detail_tv_shop_name)
    TextView actGoodDetailTvShopName;
    @BindView(R.id.act_good_detail_tv_product_name)
    TextView actGoodDetailTvProductName;
    @BindView(R.id.act_good_detail_ll_shop)
    AutoLinearLayout actGoodDetailLlShop;
    @BindView(R.id.act_good_detail_ll_service)
    AutoLinearLayout actGoodDetailLlService;
    @BindView(R.id.act_good_detail_ll_collect)
    AutoLinearLayout actGoodDetailLlCollect;
    @BindView(R.id.act_good_detail_btn_shop_car)
    Button actGoodDetailBtnShopCar;
    @BindView(R.id.act_good_detail_btn_buy)
    Button actGoodDetailBtnBuy;

    private long mGoodsId = 0;
    private String mGoodsName;

    private List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> goodsDetailsBeanList = new ArrayList<>();

    @Override
    public int bindLayout() {
        return R.layout.activity_good_detail;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);

        //获取传递过来商品ID
        Intent intent = getIntent();
        if(intent != null) mGoodsId = intent.getLongExtra("detailGoodId", 0);

        initInject();
        initData();
    }

    private void initData() {
        mPresenter.requestDetailData("pdd",mGoodsId);
    }

    private void initInject() {
        DaggerGoodDetailComponent.builder().goodDetailModule(new GoodDetailModule(this)).build().injectGoodDetailActivity(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void initDetailData(List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> goods_details) {
        goodsDetailsBeanList.addAll(goods_details);
        //获取到Banner列表
        List<String> imageList = goods_details.get(0).getGoods_gallery_urls();
        initBanner(imageList);

        //获取价格
        int minGroupPrice = goods_details.get(0).getMin_group_price();
        int normalPrice = goods_details.get(0).getMin_normal_price();
        actGoodDetailTvMinPrice.setText(""+minGroupPrice / 100.0);
        actGoodDetailTvNormalPrice.setText(normalPrice / 100.0 + "元");

        //店铺名
        String mallName = goods_details.get(0).getMall_name();
        actGoodDetailTvShopName.setText("店铺:"+mallName);

        //商品名称
        mGoodsName = goods_details.get(0).getGoods_name();
        actGoodDetailTvProductName.setText(""+mGoodsName);
    }

    private void initBanner(List<String> imageList) {
        actGoodDetailBanner.setImages(imageList);
        actGoodDetailBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                GlideUtil.getInstance().showImg(context, (String) path,imageView);
            }
        });

        actGoodDetailBanner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        actGoodDetailBanner.isAutoPlay(false);
        actGoodDetailBanner.start();
    }

    @OnClick({R.id.act_good_detail_btn_back, R.id.act_good_detail_ll_shop, R.id.act_good_detail_ll_service, R.id.act_good_detail_ll_collect, R.id.act_good_detail_btn_shop_car, R.id.act_good_detail_btn_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.act_good_detail_btn_back:
                finish();
                overridePendingTransition(R.anim.anim_good_detail_enter,R.anim.anim_good_detail_exit);
                break;
            case R.id.act_good_detail_ll_shop:
                showToast("由于开发者太懒,该功能暂未开发");
                break;
            case R.id.act_good_detail_ll_service:
                showToast("由于开发者老婆太懒,该功能暂未开发");
                break;
            case R.id.act_good_detail_ll_collect:
                showToast("由于李晓太懒,该功能暂未开发");
                break;
            case R.id.act_good_detail_btn_shop_car:
                //将该商品信息存储进数据库
                insertLocalData();
                break;
            case R.id.act_good_detail_btn_buy:
                break;
        }
    }

    private void insertLocalData() {
        List<GreenShop> greenShops = MyApp.getInstance().getDaoSession().getGreenShopDao().loadAll();

        boolean flag = false;
        for (GreenShop greenShop : greenShops) {
            String shop = greenShop.getShop();
            GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean = new Gson().fromJson(shop, GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean.class);
            //判断数据库中是否有相同的商品
            if(goodsDetailsBean.getGoods_name().equals(mGoodsName)) {
                //获取该商品在购物车中的数量,+1
                int shopCarNum = goodsDetailsBean.getShopCarNum();
                goodsDetailsBean.setShopCarNum(++shopCarNum);
                MyApp.getInstance().getDaoSession().getGreenShopDao().update(new GreenShop(greenShop.getId(),new Gson().toJson(goodsDetailsBean)));

                flag = true;
                //通知购物车页面,刷新数据
                EventBus.getDefault().post("It's time to refresh");
                showToast("加入购物车成功");
                break;
            }
        }
        //数据库中不存在该商品,直接插入
        if(!flag && goodsDetailsBeanList.size() > 0) {
            String json = new Gson().toJson(goodsDetailsBeanList.get(0));
            MyApp.getInstance().getDaoSession().getGreenShopDao().insert(new GreenShop(null, json));
            EventBus.getDefault().post("It's time to refresh");
            showToast("加入购物车成功");
        }
    }
}