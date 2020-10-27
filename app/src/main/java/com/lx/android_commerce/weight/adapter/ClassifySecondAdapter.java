package com.lx.android_commerce.weight.adapter;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;

import java.util.List;

public
/**
 * @author : 阿森
 * @date : 2020-10-18 19:40
 * @params :
 * @description:
 */
class ClassifySecondAdapter extends BaseQuickAdapter<ClassifySecondEntity.EntityBean, BaseViewHolder> {
    public ClassifySecondAdapter(int layoutResId, @Nullable List<ClassifySecondEntity.EntityBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ClassifySecondEntity.EntityBean item) {
        helper.setText(R.id.item_classify_second_title,item.getOpt_name()+"");
        helper.addOnClickListener(R.id.item_classify_second_title);

        TextView view = helper.getView(R.id.item_classify_second_title);
        if(item.isChecked()) view.setBackgroundColor(Color.parseColor("#FF4483")); else view.setBackgroundColor(Color.parseColor("#ffffff"));
    }
}
