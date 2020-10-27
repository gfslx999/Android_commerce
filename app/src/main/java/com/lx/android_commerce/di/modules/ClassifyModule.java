package com.lx.android_commerce.di.modules;

import com.lx.android_commerce.mvp.contract.ClassifyContract;
import com.lx.android_commerce.mvp.model.ClassifyModel;

import dagger.Module;
import dagger.Provides;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:56
 *@params : 
 *@description:
 */
@Module
class ClassifyModule {

    private ClassifyContract.View mView;

    public ClassifyModule(ClassifyContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public ClassifyContract.View provideClassifyView() {
        return mView;
    }

    @Provides
    public ClassifyContract.Model provideClassifyModel(ClassifyModel classifyModel) {
        return classifyModel;
    }

}
