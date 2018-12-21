package com.zingking.javadesignmode.templatemethod.guizhou;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：所有页面的基类
 */
abstract class BaseActivity {
    private static final String TAG = "BaseActivity";

    /**
     * 在Android中是系统回调
     */
    public void onResume(){
        bigDataReportPageReady();
    }

    /**
     * 不同页面可重写改方法添加不同的值
     * @return 页面Ready时的数据
     */
    //
    public String preparePageReady() {
        return "Ready:每个页面必须的数据，如页面id。";
    }

    private void bigDataReportPageReady() {
        String data = preparePageReady();
        System.out.println(TAG + " - BaseActivity.bigDataReportPageReady -> data = " + data);
    }

    /**
     * 不同页面可重写改方法添加不同的值
     * @return 页面加载完成的数据
     */
    public String preparePageLoaded() {
        return "Loaded:每个页面必须的数据，如页面id。";
    }

    /**
     * 模板方法
     */
    public final void bigDataReportPageLoaded() {
        String data = preparePageLoaded();
        System.out.println(TAG + " - BaseActivity.bigDataReportPageLoaded -> data = " + data);
    }

}
