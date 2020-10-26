package com.lx.lib_core.mvp.view;

import androidx.annotation.LayoutRes;

/**
 * @author : 阿森
 * @date : 2020-10-16 10:15
 * @params :
 * @description:
 */
public interface IView {
    @LayoutRes
    int bindLayout();

    void initView();

    void showToast(String msg);

    void showLoading(String msg);

    void hideLoading();
}
