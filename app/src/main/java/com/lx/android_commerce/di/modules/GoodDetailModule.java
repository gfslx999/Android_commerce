package com.lx.android_commerce.di.modules;

import com.lx.android_commerce.mvp.contract.GoodDetailContract;
import com.lx.android_commerce.mvp.model.GoodDetailModel;

import dagger.Module;
import dagger.Provides;

public
/**
 *@author : 阿森
 *@date : 2020-10-27 10:00
 *@params : 
 *@description:
 */
@Module
class GoodDetailModule {
    private GoodDetailContract.View mView;

    public GoodDetailModule(GoodDetailContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public GoodDetailContract.View provideDetailView() {
        return mView;
    }

    @Provides
    public GoodDetailContract.Model provideDetailModel(GoodDetailModel goodDetailModel) {
        return goodDetailModel;
    }
}
