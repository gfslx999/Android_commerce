package com.lx.android_commerce.mvp.contract;

import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;
import com.lx.lib_core.mvp.model.IModel;
import com.lx.lib_core.mvp.view.IView;

import java.util.List;

import io.reactivex.Observer;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 13:43
 *@params : 
 *@description:
 */
interface HomeContract {

    interface View extends IView {
        void initBanner(List<HomeCatEntity.DataBean.BannersBean> bannersBeanList);
        void initNavigation(List<List<HomeNavigationEntity.EntityBean>> list);
        void initRecommend(List<HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goodsBeanList);
        void initMore(List<HomeCatEntity.DataBean.ItemsBean.ListBean> itemsBeanList);
    }

    interface Model extends IModel {
        void requestHomeCatData(int start, boolean forceRefresh, Observer<HomeCatEntity> observer);
        void requestHomeNavigationData(Observer<HomeNavigationEntity> observer);
        void requestHomeRecommendData(String token, Observer<HomeRecommendEntity> observer);
    }

}
