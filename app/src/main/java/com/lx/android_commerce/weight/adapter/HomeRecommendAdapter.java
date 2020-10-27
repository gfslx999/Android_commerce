package com.lx.android_commerce.weight.adapter;

import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;
import com.lx.lib_core.weight.utils.GlideUtil;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 16:20
 *@params : 
 *@description:
 */
class HomeRecommendAdapter extends BaseQuickAdapter<HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean,BaseViewHolder> {
    public HomeRecommendAdapter(int layoutResId, @Nullable List<HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean item) {
        GlideUtil.getInstance().showCornerImg(mContext,item.getGoods_thumbnail_url(),helper.getView(R.id.item_home_recommend_rv),15);

        //设置内容
        helper.setText(R.id.item_home_recommend_iv_title,item.getGoods_name()+"");
        helper.setText(R.id.item_home_recommend_tv_price,item.getAwardAmount() / 10.0+"");
        helper.setText(R.id.item_home_recommend_tv_old_price,"原价¥"+item.getPlusAmount() / 10.0);

        TextView textView = helper.getView(R.id.item_home_recommend_tv_old_price);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
    }
}
