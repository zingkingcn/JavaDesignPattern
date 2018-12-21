package com.zingking.javadesignmode.templatemethod.guizhou;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    public String preparePageReady() {
        String pageReady = super.preparePageReady();
        pageReady = pageReady + "MainActivity的Ready参数。";
        return pageReady;
    }

    @Override
    public String preparePageLoaded() {
        String pageLoaded = super.preparePageLoaded();
        pageLoaded = pageLoaded + "MainActivity的Loaded参数。";
        return pageLoaded;
    }

    public void loadedSuccess(){
        System.out.println(TAG + " - MainActivity.loadedSuccess -> 页面数据加载成功.");
        bigDataReportPageLoaded();
    }

}
