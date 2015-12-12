package com.lnyp.vf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 禁止ViewPager左右滑动
 */
public class ContainerViewPager extends MyViewPager {
    public ContainerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        return false;
    }
}