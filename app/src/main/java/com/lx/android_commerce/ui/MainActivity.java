package com.lx.android_commerce.ui;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.blankj.utilcode.util.SPUtils;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.android_commerce.mvp.view.fragment.ClassifyFragment;
import com.lx.android_commerce.mvp.view.fragment.HomeFragment;
import com.lx.android_commerce.mvp.view.fragment.PersonFragment;
import com.lx.android_commerce.mvp.view.fragment.ShopCarFragment;
import com.lx.android_commerce.weight.entity.MyTab;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.act_main_fl)
    FrameLayout actMainFl;
    @BindView(R.id.act_main_commonTab)
    CommonTabLayout actMainCommonTab;
    private ArrayList<CustomTabEntity> tabEntities = new ArrayList<>();
    private Map<BottomType, Fragment> cachesMap = new HashMap<>();
    private BottomType currentPage = BottomType.NONE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        initBottom();
    }

    private void initBottom() {
        tabEntities.add(new MyTab("首页", R.mipmap.home_select, R.mipmap.home_unselect));
        tabEntities.add(new MyTab("分类", R.mipmap.search_select, R.mipmap.search_unselect));
        tabEntities.add(new MyTab("购物车", R.mipmap.shop_car_select, R.mipmap.shop_car_unselect));
        tabEntities.add(new MyTab("我的", R.mipmap.person_select, R.mipmap.person_unselect));

        actMainCommonTab.setTabData(tabEntities);
        showFragment(BottomType.HOME);

        actMainCommonTab.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                switch (position) {
                    case 0:showFragment(BottomType.HOME); break;
                    case 1:showFragment(BottomType.CLASSIFY); break;
                    case 2:showFragment(BottomType.SHOPCAR); break;
                    case 3:showFragment(BottomType.PERSON); break;
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

    }

    private void showFragment(BottomType bottomType) {
        if(currentPage == BottomType.NONE) {
            getSupportFragmentManager().beginTransaction().add(R.id.act_main_fl,getFragment(bottomType)).commit();
        } else {
            if(cachesMap.containsKey(bottomType)) {
                getSupportFragmentManager().beginTransaction().hide(getFragment(currentPage)).show(getFragment(bottomType)).commit();
            } else {
                getSupportFragmentManager().beginTransaction().hide(getFragment(currentPage)).add(R.id.act_main_fl,getFragment(bottomType)).commit();

            }
        }
        //更新当前页标
        currentPage = bottomType;
    }

    private Fragment getFragment(BottomType bottomType) {
        if(cachesMap.containsKey(bottomType)) {
            return cachesMap.get(bottomType);
        } else {
            switch (bottomType) {
                case HOME:
                    HomeFragment homeFragment = new HomeFragment();
                    cachesMap.put(bottomType,homeFragment);
                    return homeFragment;
                case CLASSIFY:
                    ClassifyFragment classifyFragment = new ClassifyFragment();
                    cachesMap.put(bottomType,classifyFragment);
                    return classifyFragment;
                case SHOPCAR:
                    ShopCarFragment shopCarFragment = new ShopCarFragment();
                    cachesMap.put(bottomType,shopCarFragment);
                    return shopCarFragment;
                case PERSON:
                    PersonFragment personFragment = new PersonFragment();
                    cachesMap.put(bottomType,personFragment);
                    return personFragment;
                default: return new Fragment();
            }
        }
    }

    enum BottomType {
        HOME,
        CLASSIFY,
        SHOPCAR,
        PERSON,
        NONE
    }

}