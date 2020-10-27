package com.lx.android_commerce.mvp.model;

import com.lx.android_commerce.mvp.api.BaseApi;
import com.lx.android_commerce.mvp.contract.GoodDetailContract;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
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
 *@date : 2020-10-27 09:27
 *@params : 
 *@description:
 */
class GoodDetailModel extends BaseModel implements GoodDetailContract.Model {

    @Inject
    public GoodDetailModel(){}

    @Override
    public void requestDetailData(String threePosition, int goods_id, Observer<GoodDetailEntity> observer) {
        HttpRetrofitManager.getInstance().getRetrofit(BaseUrlApi.BASE_URL_COMMERCE)
                .create(BaseApi.class)
                .requestGoodDetailData(threePosition,goods_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
