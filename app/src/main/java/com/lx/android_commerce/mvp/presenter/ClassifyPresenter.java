package com.lx.android_commerce.mvp.presenter;

import android.widget.EditText;

import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.mvp.contract.ClassifyContract;
import com.lx.android_commerce.weight.CacheMemory;
import com.lx.android_commerce.weight.DarkConstant;
import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.lib_core.mvp.presenter.BasePresenter;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:40
 *@params : 
 *@description:
 */
class ClassifyPresenter extends BasePresenter<ClassifyContract.Model,ClassifyContract.View> {

    @Inject
    public ClassifyPresenter(){}

    public void requestThirdData(int page_size, int sort_type, int opt_id) {
        mModel.requestClassifyThirdData(page_size, sort_type, opt_id, new Observer<ClassifyThirdEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(ClassifyThirdEntity classifyThirdEntity) {
                List<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = classifyThirdEntity.getEntity().getGoods_search_response().getGoods_list();
                mView.initThirdLevel(goods_list);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE("三级列表"+e.getMessage(),0);
            }

            @Override
            public void onComplete() {
            }
        });
    }

    public void requestSecondData(int parent_opt_id) {
        mModel.requestClassifySecondData(parent_opt_id, new Observer<ClassifySecondEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }

            @Override
            public void onNext(ClassifySecondEntity classifySecondEntity) {
                List<ClassifySecondEntity.EntityBean> entity = classifySecondEntity.getEntity();
                mView.initSecondLevel(entity);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE("二级列表"+e.getMessage(),0);
            }

            @Override
            public void onComplete() {

            }
        });
    }
    
    public void requestFirstData(int parent_opt_id) {
        mModel.requestClassifyFirstData(parent_opt_id, new Observer<ClassifyFirstEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }

            @Override
            public void onNext(ClassifyFirstEntity classifyFirstEntity) {
                List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> goods_opt_list = classifyFirstEntity.getEntity().getGoods_opt_get_response().getGoods_opt_list();
                mView.initFirstLevel(goods_opt_list);

                String json = new Gson().toJson(classifyFirstEntity);
                //存入缓存和数据库
                CacheMemory.getInstance().saveCache("firstLevelDataKey",json);
                MyApp.getInstance().insertLocalData(DarkConstant.GREEN_CLASSIFY_FIRST_LEVEL_ID,json);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.getInstance().logE("一级列表"+e.getMessage(),0);
            }

            @Override
            public void onComplete() {

            }
        });
    }

}
