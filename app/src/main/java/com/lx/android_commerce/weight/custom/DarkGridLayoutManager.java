package com.lx.android_commerce.weight.custom;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.GridLayoutManager;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 15:43
 *@params : 
 *@description:
 */
class DarkGridLayoutManager extends GridLayoutManager {

    private boolean isScrollEnabled = true;

    public DarkGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public DarkGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public DarkGridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    public void setScrollEnabled(boolean flag) {
        isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        return isScrollEnabled && super.canScrollVertically();
    }
}
