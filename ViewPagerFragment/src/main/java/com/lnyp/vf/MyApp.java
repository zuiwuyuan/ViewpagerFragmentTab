package com.lnyp.vf;

import android.app.Application;

import com.apkfuns.logutils.LogUtils;

/**
 * Created by 李宁 on 2015/11/1.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogUtils.configAllowLog = true;

        LogUtils.configTagPrefix = "lnyp-";
    }
}
