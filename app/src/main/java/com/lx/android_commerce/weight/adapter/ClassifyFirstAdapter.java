package com.lx.android_commerce.weight.adapter;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:49
 *@params : 
 *@description:
 */
class ClassifyFirstAdapter extends BaseQuickAdapter<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean, BaseViewHolder> {
    public ClassifyFirstAdapter(int layoutResId, @Nullable List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean item) {
        helper.setText(R.id.item_classify_first_title,item.getOpt_name()+"");
        helper.addOnClickListener(R.id.item_classify_first_title);

        TextView view = helper.getView(R.id.item_classify_first_title);
        if (item.isChecked()) {
            view.setBackgroundColor(Color.parseColor("#f7f7f7"));
        } else view.setBackgroundColor(Color.parseColor("#FFFFFF"));

    }
}
