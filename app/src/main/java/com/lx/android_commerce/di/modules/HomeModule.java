package com.lx.android_commerce.di.modules;

import com.lx.android_commerce.mvp.contract.HomeContract;
import com.lx.android_commerce.mvp.model.HomeModel;

import dagger.Module;
import dagger.Provides;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 14:05
 *@params : 
 *@description:
 */
@Module
class HomeModule {

    private HomeContract.View homeView;

    public HomeModule(HomeContract.View homeView) {
        this.homeView = homeView;
    }

    @Provides
    public HomeContract.View provideHomeView() {
        return homeView;
    }

    @Provides
    public HomeContract.Model provideHomeModel(HomeModel homeModel) {
        return homeModel;
    }

}
