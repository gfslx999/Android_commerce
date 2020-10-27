package com.lx.android_commerce.weight.entity;

import com.flyco.tablayout.listener.CustomTabEntity;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 11:23
 *@params : 
 *@description:
 */
class MyTab implements CustomTabEntity {

    private String title;
    private int selectIcon;
    private int unSelectIcon;

    public MyTab(String title, int selectIcon, int unSelectIcon) {
        this.title = title;
        this.selectIcon = selectIcon;
        this.unSelectIcon = unSelectIcon;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectIcon;
    }
}
