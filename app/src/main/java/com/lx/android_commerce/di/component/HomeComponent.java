package com.lx.android_commerce.di.component;

import com.lx.android_commerce.di.modules.HomeModule;
import com.lx.android_commerce.mvp.view.fragment.HomeFragment;

import dagger.Component;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 14:04
 *@params : 
 *@description:
 */
@Component(modules = HomeModule.class)
interface HomeComponent {
    void injectHomeFragment(HomeFragment homeFragment);
}
