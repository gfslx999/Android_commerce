package com.lx.android_commerce.mvp.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.android_commerce.di.component.DaggerHomeComponent;
import com.lx.android_commerce.di.modules.HomeModule;
import com.lx.android_commerce.mvp.contract.HomeContract;
import com.lx.android_commerce.mvp.presenter.HomePresenter;
import com.lx.android_commerce.ui.DetailActivity;
import com.lx.android_commerce.weight.CacheMemory;
import com.lx.android_commerce.weight.DarkConstant;
import com.lx.android_commerce.weight.adapter.HomeMoreAdapter;
import com.lx.android_commerce.weight.adapter.HomeNavigationAdapter;
import com.lx.android_commerce.weight.adapter.HomeRecommendAdapter;
import com.lx.android_commerce.weight.custom.DarkGridLayoutManager;
import com.lx.android_commerce.weight.custom.DarkScrollView;
import com.lx.android_commerce.weight.custom.DarkStaggeredGridLayoutManager;
import com.lx.android_commerce.weight.entity.GreenCache;
import com.lx.android_commerce.weight.entity.HomeCatEntity;
import com.lx.android_commerce.weight.entity.HomeNavigationEntity;
import com.lx.android_commerce.weight.entity.HomeRecommendEntity;
import com.lx.lib_core.mvp.view.BaseFragment;
import com.lx.lib_core.weight.utils.GlideUtil;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 11:20
 *@params : 
 *@description:
 */
class HomeFragment extends BaseFragment<HomePresenter> implements HomeContract.View {
    @BindView(R.id.fra_home_edit_query)
    EditText fraHomeEditQuery;
    @BindView(R.id.fra_home_iv_message)
    ImageView fraHomeIvMessage;
    @BindView(R.id.fra_home_banner)
    Banner fraHomeBanner;
    @BindView(R.id.fra_home_rv_status)
    RecyclerView fraHomeRvStatus;
    @BindView(R.id.fra_home_rv_hot)
    RecyclerView fraHomeRvHot;
    @BindView(R.id.fra_home_darkScrollView)
    DarkScrollView fraHomeDarkScrollView;
    @BindView(R.id.fra_home_rv_more)
    RecyclerView fraHomeRvMore;
    @BindView(R.id.fra_home_ll_more)
    LinearLayout fraHomeLlMore;

    private HomeNavigationAdapter mHomeNavigationAdapter;
    private List<HomeNavigationEntity.EntityBean> entityBeans = new ArrayList<>();

    private HomeRecommendAdapter mHomeRecommendAdapter;
    private List<HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goodsListBeans = new ArrayList<>();

    private HomeMoreAdapter mHomeMoreAdapter;
    private List<HomeCatEntity.DataBean.ItemsBean.ListBean> itemsBeanList = new ArrayList<>();

    @Override
    public int bindLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
        //初始化导航列表
        DarkGridLayoutManager darkGridLayoutManager = new DarkGridLayoutManager(getActivity(), 5);
        //设置不可滑动
        darkGridLayoutManager.setScrollEnabled(false);
        mHomeNavigationAdapter = new HomeNavigationAdapter(R.layout.item_home_navigation_layout, entityBeans);
        fraHomeRvStatus.setLayoutManager(darkGridLayoutManager);
        fraHomeRvStatus.setAdapter(mHomeNavigationAdapter);

        //初始化推荐列表
        mHomeRecommendAdapter = new HomeRecommendAdapter(R.layout.item_home_recommend_layout, goodsListBeans);
        fraHomeRvHot.setAdapter(mHomeRecommendAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        fraHomeRvHot.setLayoutManager(linearLayoutManager);

        //初始化底部列表
        DarkStaggeredGridLayoutManager darkStaggeredGridLayoutManager = new DarkStaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //设置不可滑动
        darkStaggeredGridLayoutManager.setCanScrollVertically(false);
        fraHomeRvMore.setLayoutManager(darkStaggeredGridLayoutManager);
        mHomeMoreAdapter = new HomeMoreAdapter(itemsBeanList);
        fraHomeRvMore.setAdapter(mHomeMoreAdapter);

        //点击跳转详情页
        mHomeMoreAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DarkConstant.HOME_MORE_LIST_DETAIL_URL,itemsBeanList.get(position).getUrl());
                startActivity(intent);
            }
        });

        initInject();
        initData();
    }

    private void initInject() {
        DaggerHomeComponent.builder().homeModule(new HomeModule(this)).build().injectHomeFragment(this);
    }

    private void initData() {
        String homeCatCacheKey = CacheMemory.getInstance().getCache("homeCatCacheKey");
        GreenCache load = MyApp.getInstance().getDaoSession().getGreenCacheDao().load((long) DarkConstant.GREEN_HOME_CAT_ID);
        String localCatData = "";
        if(load != null) {
            localCatData = load.getValue();
        }

        if(!homeCatCacheKey.equals("")) {
            analysisLocalHomeCatData(homeCatCacheKey);
        } else if (!localCatData.equals("")) {
            analysisLocalHomeCatData(localCatData);
        } else {
            mPresenter.requestHomeCatData(0, true);
        }

        mPresenter.requestHomeNavigationData();
        mPresenter.requestHomeRecommendData("29fca99630f10f1b2dd354a19fb37ad9");
    }

    private void analysisLocalHomeCatData(String homeCatCacheKey) {
        HomeCatEntity homeCatEntity = new Gson().fromJson(homeCatCacheKey, HomeCatEntity.class);
        List<HomeCatEntity.DataBean.BannersBean> banners = homeCatEntity.getData().getBanners();
        List<HomeCatEntity.DataBean.ItemsBean.ListBean> list = homeCatEntity.getData().getItems().getList();

        initBanner(banners);
        initMore(list);
    }

    //初始化轮播
    @Override
    public void initBanner(List<HomeCatEntity.DataBean.BannersBean> bannersBeanList) {
        List<String> imageList = new ArrayList<>();
        for (int i = 0; i < bannersBeanList.size(); i++) {
            String imageUrl = bannersBeanList.get(i).getImageUrl();
            imageList.add(imageUrl);
        }

        fraHomeBanner.setImages(imageList);

        fraHomeBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                GlideUtil.getInstance().showImg(getActivity(), (String) path, imageView);
//                GlideUtil.getInstance().showCornerImg(getActivity(), (String) path, imageView, 15);
            }
        });
        //开始播放
        fraHomeBanner.start();

    }

    //初始化导航界面
    @Override
    public void initNavigation(List<List<HomeNavigationEntity.EntityBean>> list) {
        entityBeans.addAll(list.get(0));
        entityBeans.addAll(list.get(1));

        mHomeNavigationAdapter.notifyDataSetChanged();
    }

    @Override
    public void initRecommend(List<HomeRecommendEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goodsBeanList) {
        goodsListBeans.addAll(goodsBeanList);
        mHomeRecommendAdapter.notifyDataSetChanged();
    }

    @Override
    public void initMore(List<HomeCatEntity.DataBean.ItemsBean.ListBean> list) {
        itemsBeanList.addAll(list);

        mHomeMoreAdapter.notifyDataSetChanged();
    }

    @OnClick(R.id.fra_home_iv_message)
    public void onViewClicked() {
    }
}
