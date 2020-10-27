package com.lx.android_commerce.weight.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public
/**
 *@author : 阿森
 *@date : 2020-10-17 08:22
 *@params : 
 *@description:
 */


class DarkScrollView extends ScrollView {

    private boolean isScrollTop = true;
    private boolean isScrollBottom = false;

    private ScrollChangedListener mScrollChangedListener;

    public DarkScrollView(Context context) {
        super(context);
    }

    public DarkScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DarkScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //监听ScrollView状态
    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);

        if(scrollY <= 0) {
            isScrollTop = clampedY;
            isScrollBottom = false;
        } else {
            isScrollTop = false;
            isScrollBottom = clampedY;
        }
        notifyScrollChangedListener();
    }

    private void notifyScrollChangedListener() {
        if(mScrollChangedListener != null) {
            if(isScrollTop) {
                mScrollChangedListener.onScrollTop();
            } else if(isScrollBottom) mScrollChangedListener.onScrollBottom();
        }
    }

    public void setScrollChangedListener(ScrollChangedListener mScrollChangedListener) {
        this.mScrollChangedListener = mScrollChangedListener;
    }

    public interface ScrollChangedListener {
        void onScrollTop();
        void onScrollBottom();
    }

}
