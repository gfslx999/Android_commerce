package com.lx.android_commerce.mvp.api;

import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 13:48
 *@params : 
 *@description:
 */
interface BaseApi {

    @GET("api/tab/1")
    Observable<HomeCatEntity> requestHomeCatData(@Query("start") String start, @Query("forceRefresh")boolean forceRefresh);

    @GET("app/tk/taobao/getHomeOptIcon")
    Observable<HomeNavigationEntity> requestHomeNavigationData();

    @GET("app/tk/v2/getChaoJiBaoKuan")
    Observable<HomeRecommendEntity> requestHomeRecommendData(@Query("token") String token);

    @GET("app/tk/v2/getGoodsOpt")
    Observable<ClassifyFirstEntity> requestClassifyFirstData(@Query("parent_opt_id") int parent_opt_id);

    @GET("app/tk/v2/getGoodsOpt")
    Observable<ClassifySecondEntity> requestClassifySecondData(@Query("parent_opt_id") int parent_opt_id);

    @GET("app/getGoodsSearch")
    Observable<ClassifyThirdEntity> requestClassifyThirdData(@Query("page_size") int page_size,@Query("sort_type") int sort_type,@Query("opt_id") int opt_id);

}
