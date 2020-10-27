package com.lx.android_commerce.di.component;

import com.lx.android_commerce.di.modules.GoodDetailModule;
import com.lx.android_commerce.mvp.view.activity.GoodDetailActivity;

import dagger.Component;

public
/**
 *@author : 阿森
 *@date : 2020-10-27 10:02
 *@params : 
 *@description:
 */
@Component(modules = GoodDetailModule.class)
interface GoodDetailComponent {
    void injectGoodDetailActivity(GoodDetailActivity goodDetailActivity);
}
