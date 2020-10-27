package com.lx.android_commerce.mvp.presenter;

import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.mvp.contract.HomeContract;
import com.lx.android_commerce.weight.CacheMemory;
import com.lx.android_commerce.weight.DarkConstant;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;
import com.lx.lib_core.mvp.presenter.BasePresenter;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.Cache;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 13:58
 *@params : 
 *@description:
 */
class HomePresenter extends BasePresenter<HomeContract.Model,HomeContract.View> {

    @Inject
    public HomePresenter(){}

    public void requestHomeRecommendData(String token) {
        mModel.requestHomeRecommendData(token, new Observer<HomeRecommendEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(HomeRecommendEntity homeRecommendEntity) {
                mView.initRecommend(homeRecommendEntity.getEntity().getGoods_search_response().getGoods_list());
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE(e.getMessage(),0);
            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void requestHomeNavigationData() {
        mModel.requestHomeNavigationData(new Observer<HomeNavigationEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(HomeNavigationEntity homeNavigationEntity) {
                List<List<HomeNavigationEntity.EntityBean>> entity = homeNavigationEntity.getEntity();
                mView.initNavigation(entity);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE(e.getMessage(),0);
            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void requestHomeCatData(int start,boolean forceRefresh) {
        mModel.requestHomeCatData(start, forceRefresh, new Observer<HomeCatEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(HomeCatEntity homeCatEntity) {
                mView.initBanner(homeCatEntity.getData().getBanners());
                //精选列表
                HomeCatEntity.DataBean.ItemsBean items = homeCatEntity.getData().getItems();
                List<HomeCatEntity.DataBean.ItemsBean.ListBean> list = items.getList();
                mView.initMore(list);

                String json = new Gson().toJson(homeCatEntity);

                //存入缓存和数据库
                CacheMemory.getInstance().saveCache("homeCatCacheKey",json);
                MyApp.getInstance().insertLocalData(DarkConstant.GREEN_HOME_CAT_ID,json);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE(e.getMessage(),0);
            }

            @Override
            public void onComplete() {

            }
        });
    }

}
