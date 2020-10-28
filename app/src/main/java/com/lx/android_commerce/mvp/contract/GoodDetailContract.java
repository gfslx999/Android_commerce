package com.lx.android_commerce.mvp.contract;

import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.lib_core.mvp.model.IModel;
import com.lx.lib_core.mvp.view.IView;

import java.util.List;

import io.reactivex.Observer;

public
/**
 *@author : 阿森
 *@date : 2020-10-27 09:26
 *@params : 
 *@description:
 */
interface GoodDetailContract {

    interface View extends IView {
        void initDetailData(List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> goods_details);
    }

    interface Model extends IModel {
        void requestDetailData(String threePosition, long goods_id, Observer<GoodDetailEntity> observer);
    }

}
