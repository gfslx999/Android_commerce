package com.lx.android_commerce.weight.adapter;

import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.lib_core.weight.utils.GlideUtil;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-25 10:07
 *@params : 
 *@description:
 */
class ClassifyThirdAdapter extends BaseQuickAdapter<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean, BaseViewHolder> {
    public ClassifyThirdAdapter(int layoutResId, @Nullable List<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean item) {
        helper.setText(R.id.item_classify_third_tv_title,item.getGoods_name());
        helper.setText(R.id.item_classify_third_tv_shopName,item.getMall_name());
        helper.setText(R.id.item_classify_third_tv_min_price,"剁手价:¥"+item.getMin_group_price() / 100.0);
        helper.setText(R.id.item_classify_third_tv_normal_price,"原价:¥"+item.getMin_normal_price() / 100.0);
        GlideUtil.getInstance().showImg(mContext,item.getGoods_thumbnail_url(),helper.getView(R.id.item_classify_third_iv_photo));

        TextView textView = helper.getView(R.id.item_classify_third_tv_normal_price);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
    }
}
