package com.lx.android_commerce.mvp.contract;

import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.lib_core.mvp.model.IModel;
import com.lx.lib_core.mvp.view.IView;

import java.util.List;

import io.reactivex.Observer;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:32
 *@params : 
 *@description:
 */
interface ClassifyContract {

    interface View extends IView {
        void initFirstLevel(List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> goods_opt_list);
        void initSecondLevel(List<ClassifySecondEntity.EntityBean> entity);
        void initThirdLevel(List<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list);
    }

    interface Model extends IModel {
        void requestClassifyFirstData(int parent_opt_id, Observer<ClassifyFirstEntity> observer);
        void requestClassifySecondData(int parent_opt_id, Observer<ClassifySecondEntity> observer);
        void requestClassifyThirdData(int page_size,int sort_type,int opt_id, Observer<ClassifyThirdEntity> observer);
    }

}
