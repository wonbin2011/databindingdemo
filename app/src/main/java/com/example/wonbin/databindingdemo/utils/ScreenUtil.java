package com.example.wonbin.databindingdemo.utils;

import android.content.Context;

/**
 * Created by wonbin on 5/23/16.
 */
public class ScreenUtil {
    public static float dp2px(final Context context, final float dpValue) {
        return dpValue * context.getResources().getDisplayMetrics().density;
    }
}
