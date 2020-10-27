package com.lx.android_commerce.mvp.model;

import com.lx.android_commerce.mvp.api.BaseApi;
import com.lx.android_commerce.mvp.contract.HomeContract;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;
import com.lx.lib_core.mvp.model.BaseModel;
import com.lx.lib_core.weight.network.BaseUrlApi;
import com.lx.lib_core.weight.network.HttpRetrofitManager;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 13:51
 *@params : 
 *@description:
 */
class HomeModel extends BaseModel implements HomeContract.Model {

    @Inject
    public HomeModel(){}

    @Override
    public void requestHomeCatData(int start, boolean forceRefresh, Observer<HomeCatEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_XIONGMAO)
                .create(BaseApi.class)
                .requestHomeCatData(start+"",forceRefresh)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    @Override
    public void requestHomeNavigationData(Observer<HomeNavigationEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestHomeNavigationData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    @Override
    public void requestHomeRecommendData(String token, Observer<HomeRecommendEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestHomeRecommendData(token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
