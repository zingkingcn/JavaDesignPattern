package com.zingking.javadesignmode.templatemethod.guizhou;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
class Main {
    public static void main(String[] args){
        SplashActivity splashActivity = new SplashActivity();
        // 模拟系统回调
        splashActivity.onResume();
        // 模拟数据加载完成
        splashActivity.loadedSuccess();

        MainActivity mainActivity = new MainActivity();
        // 模拟系统回调
        mainActivity.onResume();
        // 模拟数据加载完成
        mainActivity.loadedSuccess();
    }
}
