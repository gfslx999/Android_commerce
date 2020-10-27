package com.lx.android_commerce.mvp.presenter;

import com.lx.android_commerce.mvp.contract.GoodDetailContract;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.lib_core.mvp.presenter.BasePresenter;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public
/**
 *@author : 阿森
 *@date : 2020-10-27 09:29
 *@params : 
 *@description:
 */
class GoodDetailPresenter extends BasePresenter<GoodDetailContract.Model,GoodDetailContract.View> {

    @Inject
    public GoodDetailPresenter(){}

    public void requestDetailData(String threePosition, int goods_id) {
        mModel.requestDetailData(threePosition, goods_id, new Observer<GoodDetailEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(GoodDetailEntity goodDetailEntity) {
                List<GoodDetailEntity.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> goods_details = goodDetailEntity.getEntity().getGoods_detail_response().getGoods_details();
                mView.initDetailData(goods_details);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logI(e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }

}
