package com.lx.android_commerce.weight.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.lib_core.weight.utils.GlideUtil;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-29 13:47
 *@params : 
 *@description:
 */
class ShopCarAdapter extends BaseQuickAdapter<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean, BaseViewHolder> {
    public ShopCarAdapter(int layoutResId, @Nullable List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean item) {
        helper.setText(R.id.item_shop_car_tv_product_name,item.getGoods_name());
        helper.setText(R.id.item_shop_car_tv_product_num,item.getShopCarNum()+"");
        helper.setText(R.id.item_shop_car_tv_product_price,"¥"+item.getMin_group_price() / 100.0);
        helper.setText(R.id.item_shop_car_tv_store_name,item.getMall_name());
        GlideUtil.getInstance().showImg(mContext,item.getGoods_thumbnail_url(),helper.getView(R.id.item_shop_car_iv_photo));
        //添加子控件点击事件
        helper.addOnClickListener(R.id.item_shop_car_iv_photo);
        helper.addOnClickListener(R.id.item_shop_car_iv_add);
        helper.addOnClickListener(R.id.item_shop_car_iv_subtract);
        helper.addOnClickListener(R.id.item_shop_car_checked);
        helper.addOnClickListener(R.id.item_shop_car_iv_remove);

        //拼接商品可享优惠字符串
        List<String> unified_tags = item.getUnified_tags();
        StringBuilder mUnified = new StringBuilder();
        //判断是否显示该图片
        ImageView ivXiang = helper.getView(R.id.item_shop_car_iv_xiang);
        if(unified_tags != null) {
            ivXiang.setVisibility(View.VISIBLE);
            for (String unified_tag : unified_tags) {
                mUnified.append(unified_tag).append(" ");
            }
        } else {
            ivXiang.setVisibility(View.GONE);
            helper.setText(R.id.item_shop_car_tv_product_serve,mUnified+"");
        }
        //判断该商品是否选中
        CheckBox checkBox = helper.getView(R.id.item_shop_car_checked);
        checkBox.setChecked(item.isChecked());
        //判断是否显示删除图标
        ImageView ivRemove = helper.getView(R.id.item_shop_car_iv_remove);
        if(item.isShowRemove()) ivRemove.setVisibility(View.VISIBLE); else ivRemove.setVisibility(View.GONE);
    }
}
