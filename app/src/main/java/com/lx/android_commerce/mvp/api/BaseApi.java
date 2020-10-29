package com.lx.android_commerce.mvp.api;

import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.android_commerce.weight.entity.GoodDetailEntity;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeLoadMoreEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public
/*
 @author : 阿森
 @date : 2020-10-16 13:48
 @params :
 @description:
 */
interface BaseApi {

    //请求首页banner和更多商品数据
    @GET("api/tab/1")
    Observable<HomeCatEntity> requestHomeCatData(@Query("start") String start, @Query("forceRefresh")boolean forceRefresh);

    //首页导航栏
    @GET("app/tk/taobao/getHomeOptIcon")
    Observable<HomeNavigationEntity> requestHomeNavigationData();

    //首页推荐
    @GET("app/tk/v2/getChaoJiBaoKuan")
    Observable<HomeRecommendEntity> requestHomeRecommendData(@Query("token") String token);

    //首页加载更多
    @GET("app/tk/taobao/getGoodsHomePagSearch?device_type=ANDROID&opt_id=-99&token=")
    Observable<HomeLoadMoreEntity> requestHomeLoadMoreData(@Query("page")int page);

    //分类页面一级列表
    @GET("app/tk/v2/getGoodsOpt")
    Observable<ClassifyFirstEntity> requestClassifyFirstData(@Query("parent_opt_id") int parent_opt_id);

    //分类页面二级列表
    @GET("app/tk/v2/getGoodsOpt")
    Observable<ClassifySecondEntity> requestClassifySecondData(@Query("parent_opt_id") int parent_opt_id);

    //分类页面三级列表
    @GET("app/getGoodsSearch")
    Observable<ClassifyThirdEntity> requestClassifyThirdData(@Query("page_size") int page_size,@Query("sort_type") int sort_type,@Query("opt_id") int opt_id);

    //商品详情页面
    @GET("app/getGoodsDetailSingle")
    Observable<GoodDetailEntity> requestGoodDetailData(@Query("threePosition")String threePosition,@Query("goods_id")long goods_id);

}
