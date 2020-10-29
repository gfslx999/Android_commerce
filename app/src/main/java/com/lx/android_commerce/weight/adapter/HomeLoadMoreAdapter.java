package com.lx.android_commerce.weight.adapter;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.HomeLoadMoreEntity;
import com.lx.lib_core.weight.utils.GlideUtil;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-29 19:33
 *@params : 
 *@description:
 */
class HomeLoadMoreAdapter extends BaseQuickAdapter<HomeLoadMoreEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean, BaseViewHolder> {
    public HomeLoadMoreAdapter(int layoutResId, @Nullable List<HomeLoadMoreEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeLoadMoreEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean item) {
        GlideUtil.getInstance().showCornerImg(mContext,item.getGoods_image_url(),helper.getView(R.id.item_home_more_detail_iv),15);
        helper.setText(R.id.item_home_more_detail_tv_price,item.getMin_group_price()+"");
        helper.setText(R.id.item_home_more_detail_tv_title,item.getGoods_name());
        helper.setText(R.id.item_home_more_detail_tv_label,item.getMall_desc());
        helper.setText(R.id.item_home_more_detail_tv_saleNum,item.getSold_quantity()+"");
    }
}
