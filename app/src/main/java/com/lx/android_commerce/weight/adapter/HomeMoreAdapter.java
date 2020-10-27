package com.lx.android_commerce.weight.adapter;

import android.opengl.GLU;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.util.MultiTypeDelegate;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.lib_core.weight.utils.GlideUtil;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.List;

import static com.lx.android_commerce.weight.entity.HomeCatEntity.DataBean.ItemsBean.ListBean.DETAIL_TYPE;
import static com.lx.android_commerce.weight.entity.HomeCatEntity.DataBean.ItemsBean.ListBean.IMAGE_TYPE;

public
/**
 *@author : 阿森
 *@date : 2020-10-17 08:43
 *@params : 
 *@description:
 */
class HomeMoreAdapter extends BaseMultiItemQuickAdapter<HomeCatEntity.DataBean.ItemsBean.ListBean, BaseViewHolder> {

    public HomeMoreAdapter(List<HomeCatEntity.DataBean.ItemsBean.ListBean> data) {
        super(data);

        //设置布局类型
        addItemType(DETAIL_TYPE, R.layout.item_home_more_detail_layout);
        addItemType(IMAGE_TYPE, R.layout.item_home_more_image_layoyut);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeCatEntity.DataBean.ItemsBean.ListBean item) {
        //判断布局类型
        if(helper.getItemViewType() == DETAIL_TYPE) {
            helper.setText(R.id.item_home_more_detail_tv_title,item.getTitle()+"");
            helper.setText(R.id.item_home_more_detail_tv_label,item.getCouponValue()+"");
            helper.setText(R.id.item_home_more_detail_tv_price,item.getPrice()+"");
            helper.setText(R.id.item_home_more_detail_tv_saleNum,"已抢"+item.getSaleNum()+"单");

            //加载图片
            GlideUtil.getInstance().showCornerImg(mContext,item.getImage(),helper.getView(R.id.item_home_more_detail_iv),15);
        } else if(helper.getItemViewType() == IMAGE_TYPE) {
            //加载图片
            GlideUtil.getInstance().showCornerImg(mContext,item.getImage(),helper.getView(R.id.item_home_more_image_iv),15);
        }
    }
}
