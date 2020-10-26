package com.lx.lib_core.mvp.presenter;

import com.lx.lib_core.mvp.model.IModel;
import com.lx.lib_core.mvp.view.IView;

import javax.inject.Inject;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 10:24
 *@params : 
 *@description:
 */
class BasePresenter<M extends IModel,V extends IView> implements IPresenter {

    @Inject
    protected M mModel;
    @Inject
    protected V mView;

    @Override
    public void onDestroy() {
        if(mModel != null) {
            mModel.destroy();
        }
    }
}
