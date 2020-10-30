package com.lx.android_commerce.mvp.view.fragment;

import com.lx.android_commerce.R;
import com.lx.lib_core.mvp.view.BaseFragment;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 11:20
 *@params : 
 *@description:
 */
class PersonFragment extends BaseFragment {

    @BindView(R.id.fra_person_ll_delivery)
    AutoLinearLayout fraPersonLlDelivery;

    @Override
    public int bindLayout() {
        return R.layout.fragment_person;
    }

    @Override
    public void initView() {
    }

    @OnClick(R.id.fra_person_ll_delivery)
    public void onViewClicked() {

    }
}
