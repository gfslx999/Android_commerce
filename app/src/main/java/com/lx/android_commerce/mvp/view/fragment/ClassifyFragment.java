package com.lx.android_commerce.mvp.view.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.android_commerce.di.component.DaggerClassifyComponent;
import com.lx.android_commerce.di.modules.ClassifyModule;
import com.lx.android_commerce.mvp.contract.ClassifyContract;
import com.lx.android_commerce.mvp.presenter.ClassifyPresenter;
import com.lx.android_commerce.weight.CacheMemory;
import com.lx.android_commerce.weight.DarkConstant;
import com.lx.android_commerce.weight.adapter.ClassifyFirstAdapter;
import com.lx.android_commerce.weight.adapter.ClassifySecondAdapter;
import com.lx.android_commerce.weight.adapter.ClassifyThirdAdapter;
import com.lx.android_commerce.weight.entity.ClassifyFirstEntity;
import com.lx.android_commerce.weight.entity.ClassifySecondEntity;
import com.lx.android_commerce.weight.entity.ClassifyThirdEntity;
import com.lx.android_commerce.weight.entity.GreenCache;
import com.lx.lib_core.mvp.view.BaseFragment;
import com.lx.lib_core.weight.utils.LogUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;

public
/*
 @author : 阿森
 @date : 2020-10-16 11:20
 @params :
 @description:
 */
class ClassifyFragment extends BaseFragment<ClassifyPresenter> implements ClassifyContract.View {
    @BindView(R.id.fra_classify_first_rv)
    RecyclerView fraClassifyFirstRv;
    @BindView(R.id.fra_classify_second_rv)
    RecyclerView fraClassifySecondRv;
    @BindView(R.id.fra_classify_third_rv)
    RecyclerView fraClassifyThirdRv;
    @BindView(R.id.fra_classify_third_smartRefresh)
    SmartRefreshLayout fraClassifyThirdSmartRefresh;

    private int lastFirstLevelCheckedPosition = 0;
    private int lastSecondLevelCheckedPosition = 0;
    private int mThirdSortType = 0;
    private int mThirdOptId = 0;
    private boolean isLoadMore;

    private ClassifyFirstAdapter classifyFirstAdapter;
    private List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> fistGoodsList = new ArrayList<>();

    private ClassifySecondAdapter classifySecondAdapter;
    private List<ClassifySecondEntity.EntityBean> secondGoodsList = new ArrayList<>();

    private ClassifyThirdAdapter mClassifyThirdAdapter;
    private List<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> thirdGoodsList = new ArrayList<>();

    @Override
    public int bindLayout() {
        return R.layout.fragment_classify;
    }

    @Override
    public void initView() {
        //初始化一级分类列表
        classifyFirstAdapter = new ClassifyFirstAdapter(R.layout.item_classify_first_layout, fistGoodsList);
        fraClassifyFirstRv.setAdapter(classifyFirstAdapter);
        fraClassifyFirstRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        //添加分割线
        fraClassifyFirstRv.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getActivity()), DividerItemDecoration.VERTICAL));

        //初始化二级分类列表
        classifySecondAdapter = new ClassifySecondAdapter(R.layout.item_classify_second_layout, secondGoodsList);
        fraClassifySecondRv.setAdapter(classifySecondAdapter);
        //横向滑动
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        fraClassifySecondRv.setLayoutManager(linearLayoutManager);

        //初始化三级列表
        mClassifyThirdAdapter = new ClassifyThirdAdapter(R.layout.item_classify_third_layout, thirdGoodsList);
        fraClassifyThirdRv.setAdapter(mClassifyThirdAdapter);
        LinearLayoutManager mThirdRvLayoutManager = new LinearLayoutManager(getContext());
        fraClassifyThirdRv.setLayoutManager(mThirdRvLayoutManager);
        //分割线
        fraClassifyThirdRv.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext()), DividerItemDecoration.VERTICAL));

        //一级菜单点击事件
        classifyFirstAdapter.setOnItemChildClickListener((adapter, view, position) -> {
            if (view.getId() == R.id.item_classify_first_title) {
                //将之前选中的清除选中状态
                if (position != lastFirstLevelCheckedPosition) {
                    refreshFirstLevelChecked();
                    fistGoodsList.get(position).setChecked(true);
                    classifyFirstAdapter.notifyItemChanged(position);
                    //记录当前选中位置
                    lastFirstLevelCheckedPosition = position;
                    //请求二级菜单数据
                    requestSecondLevelData(position);

                    //清除三级菜单中的数据
                    isLoadMore = false;
                }
            }
        });

        //二级菜单点击事件
        classifySecondAdapter.setOnItemChildClickListener((adapter, view, position) -> {
            if (view.getId() == R.id.item_classify_second_title) {
                if (position != lastSecondLevelCheckedPosition) {
                    refreshSecondLevelChecked();
                    secondGoodsList.get(position).setChecked(true);
                    classifySecondAdapter.notifyItemChanged(position);
                    //清除三级菜单中的数据
                    isLoadMore = false;
                    //记录当前位置
                    lastSecondLevelCheckedPosition = position;
                    mThirdOptId = secondGoodsList.get(position).getOpt_id();
                    //请求三级菜单数据
                    requestThirdLevelData();
                }
            }
        });

        //三级菜单点击事件,点击跳转详情页
        mClassifyThirdAdapter.setOnItemClickListener((adapter, view, position) -> {

        });


        fraClassifyThirdSmartRefresh.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                //加载更多
                isLoadMore = true;
                mThirdSortType++;
                requestThirdLevelData();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                //刷新
                isLoadMore = false;
                mThirdSortType = 0;
                thirdGoodsList.clear();
                requestThirdLevelData();
            }
        });

        initInject();
        initData();
    }

    private void refreshFirstLevelChecked() {
        fistGoodsList.get(lastFirstLevelCheckedPosition).setChecked(false);
        classifyFirstAdapter.notifyItemChanged(lastFirstLevelCheckedPosition);
        //重置二级菜单选中的位置,防止出现同时选中两个
        lastSecondLevelCheckedPosition = 0;
    }

    private void refreshSecondLevelChecked() {
        secondGoodsList.get(lastSecondLevelCheckedPosition).setChecked(false);
        classifySecondAdapter.notifyItemChanged(lastSecondLevelCheckedPosition);
    }

    private void initInject() {
        DaggerClassifyComponent.builder().classifyModule(new ClassifyModule(this)).build().injectClassifyFragment(this);
    }

    private void initData() {
        String cacheKey = CacheMemory.getInstance().getCache("firstLevelDataKey");
        GreenCache greenCacheEntity = MyApp.getInstance().getDaoSession().getGreenCacheDao().load((long) DarkConstant.GREEN_CLASSIFY_FIRST_LEVEL_ID);
        String localDataKey = "";

        if (greenCacheEntity != null) {
            localDataKey = greenCacheEntity.getValue();
        }

        if (cacheKey != null && !cacheKey.isEmpty()) {
            analysisFirstLevelData(cacheKey);
        } else if (!localDataKey.isEmpty()) {
            analysisFirstLevelData(localDataKey);
        } else mPresenter.requestFirstData(0);
    }

    private void analysisFirstLevelData(String key) {
        ClassifyFirstEntity classifyFirstEntity = new Gson().fromJson(key, ClassifyFirstEntity.class);
        List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> goods_opt_list = classifyFirstEntity.getEntity().getGoods_opt_get_response().getGoods_opt_list();
        initFirstLevel(goods_opt_list);
    }

    @Override
    public void initFirstLevel(List<ClassifyFirstEntity.EntityBean.GoodsOptGetResponseBean.GoodsOptListBean> goods_opt_list) {
        fistGoodsList.addAll(goods_opt_list);
        //设置默认选中状态
        fistGoodsList.get(0).setChecked(true);
        classifyFirstAdapter.notifyDataSetChanged();
        //请求二级菜单数据
        requestSecondLevelData(0);
    }

    private void requestSecondLevelData(int i) {
        mPresenter.requestSecondData(fistGoodsList.get(i).getOpt_id());
    }

    @Override
    public void initSecondLevel(List<ClassifySecondEntity.EntityBean> entity) {
        if (secondGoodsList.size() != 0) secondGoodsList.clear();

        secondGoodsList.addAll(entity);
        secondGoodsList.get(0).setChecked(true);

        //滚到到顶部
        fraClassifySecondRv.scrollToPosition(0);

        classifySecondAdapter.notifyDataSetChanged();
        //初始化三级菜单数据
        mThirdOptId = secondGoodsList.get(0).getOpt_id();
        requestThirdLevelData();
    }

    private void requestThirdLevelData() {
        mPresenter.requestThirdData(10, mThirdSortType, mThirdOptId);
    }

    @Override
    public void initThirdLevel(List<ClassifyThirdEntity.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list) {

        //判断是否正在加载更多
        if(!isLoadMore && thirdGoodsList.size() > 0) {
            //清空之前的数据
            thirdGoodsList.clear();
        }

        //结束刷新或加载状态
        fraClassifyThirdSmartRefresh.finishRefresh();
        fraClassifyThirdSmartRefresh.finishLoadMore();

        thirdGoodsList.addAll(goods_list);

        //让列表滚动到头部
        if(!isLoadMore) fraClassifyThirdRv.scrollToPosition(0);

        mClassifyThirdAdapter.notifyDataSetChanged();
    }
}
