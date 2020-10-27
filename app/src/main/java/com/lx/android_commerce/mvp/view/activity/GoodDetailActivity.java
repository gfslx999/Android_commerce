package com.lx.android_commerce.mvp.view.activity;

import com.lx.android_commerce.R;
import com.lx.android_commerce.di.component.DaggerGoodDetailComponent;
import com.lx.android_commerce.di.modules.GoodDetailModule;
import com.lx.android_commerce.mvp.contract.GoodDetailContract;
import com.lx.android_commerce.mvp.presenter.GoodDetailPresenter;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.lib_core.mvp.view.BaseActivity;

import java.util.List;

public class GoodDetailActivity extends BaseActivity<GoodDetailPresenter> implements GoodDetailContract.View {

    @Override
    public int bindLayout() {
        return R.layout.activity_good_detail;
    }

    @Override
    public void initView() {

        initInject();
        initData();
    }

    private void initData() {
    }

    private void initInject() {
        DaggerGoodDetailComponent.builder().goodDetailModule(new GoodDetailModule(this)).build().injectGoodDetailActivity(this);
    }

    @Override
    public void initDetailData(List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> goods_details) {

    }
}