package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：<p>懒汉式单例类</p>
 * <p>特点：单例对象在使用才才会初始化</p>
 * <p>优点：单例对象在没有使用时不会初始化，不会浪费内存</p>
 * <p>缺点：由于单例方法加了synchronized同步，在多线程访问单例时性能不如饿汉式</p>
 */
class LazySingleton {
    private static final String TAG = "LazySingleton";
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        System.out.println(TAG + "LazySingleton() called");
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void printSomething() {
        System.out.println("I'm lazy singleton.");
    }

}
