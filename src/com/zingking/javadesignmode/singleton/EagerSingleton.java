package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：<p>饿汉式单例类</p>
 * <p>特点：类加载时单例对象就初始化</p>
 * <p>优点：多线程访问速度和性能较优</p>
 * <p>缺点：类加载比懒汉式慢；单例类未用到时浪费空间</p>
 */
class EagerSingleton {
    private static final String TAG = "EagerSingleton";

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println(TAG + "EagerSingleton() called");
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

    public void printSomething() {
        System.out.println("我是饿汉式单例模式");
    }


}
