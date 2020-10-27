package com.lx.android_commerce.mvp.model;

import com.lx.android_commerce.mvp.api.BaseApi;
import com.lx.android_commerce.mvp.contract.ClassifyContract;
import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
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
 *@date : 2020-10-18 11:36
 *@params : 
 *@description:
 */
class ClassifyModel extends BaseModel implements ClassifyContract.Model {

    @Inject
    public ClassifyModel(){}

    @Override
    public void requestClassifyFirstData(int parent_opt_id, Observer<ClassifyFirstEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestClassifyFirstData(parent_opt_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    @Override
    public void requestClassifySecondData(int parent_opt_id, Observer<ClassifySecondEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestClassifySecondData(parent_opt_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    @Override
    public void requestClassifyThirdData(int page_size, int sort_type, int opt_id, Observer<ClassifyThirdEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestClassifyThirdData(page_size,sort_type,opt_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
