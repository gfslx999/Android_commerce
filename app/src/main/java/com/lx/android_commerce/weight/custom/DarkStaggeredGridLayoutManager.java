package com.lx.android_commerce.weight.custom;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public
/**
 *@author : 阿森
 *@date : 2020-10-17 11:15
 *@params : 
 *@description:
 */
class DarkStaggeredGridLayoutManager extends StaggeredGridLayoutManager {

    private boolean flag = true;

    public DarkStaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public DarkStaggeredGridLayoutManager(int spanCount, int orientation) {
        super(spanCount, orientation);
    }

    public void setCanScrollVertically(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean canScrollVertically() {
        return flag && super.canScrollVertically();
    }
}
