package com.lx.android_commerce.weight.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.lib_core.weight.utils.GlideUtil;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 15:01
 *@params : 
 *@description:
 */
class HomeNavigationAdapter extends BaseQuickAdapter<HomeNavigationEntity.EntityBean, BaseViewHolder> {
    public HomeNavigationAdapter(int layoutResId, @Nullable List<HomeNavigationEntity.EntityBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeNavigationEntity.EntityBean item) {
        helper.setText(R.id.item_home_navigation_tv_title,item.getTitle());
        GlideUtil.getInstance().showCircleImg(mContext,"http://www.58cangshu.com/"+item.getImagesUrl(),helper.getView(R.id.item_home_navigation_iv));
    }
}
