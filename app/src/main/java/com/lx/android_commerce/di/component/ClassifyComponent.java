package com.lx.android_commerce.di.component;

import com.lx.android_commerce.di.modules.ClassifyModule;
import com.lx.android_commerce.mvp.view.fragment.ClassifyFragment;

import dagger.Component;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:58
 *@params : 
 *@description:
 */
@Component(modules = ClassifyModule.class)
interface ClassifyComponent {
    void injectClassifyFragment(ClassifyFragment classifyFragment);
}
