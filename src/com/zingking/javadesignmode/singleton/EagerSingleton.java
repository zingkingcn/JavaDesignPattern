package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：<p>饿汉式单例类</p>
 * <p>特点：类加载时单例对象就实例化</p>
 * <p>优点：多线程访问速度和性能较优</p>
 * <p>缺点：类加载比懒汉式慢(因为要实例化对象)；该实例未用到时浪费空间，
 * 解决该问题{@link com.zingking.javadesignmode.singleton.OptimizeEagerSingleton}，对比效果请调用{@link #testOptimize()}</p>
 * <p>解释：在调用静态方法{@link #testOptimize()}时，会触发类{@link EagerSingleton}的加载，在该类加载时会实例化
 * {@link EagerSingleton#eagerSingleton},但并未用到实例，浪费空间。-没有用到实例对象，实例化了一个对象，浪费空间</p>
 * <p>重点补充：</p>
 * <p>类加载：以下三种情况之一会触发类加载</p>
 * <p>1.*部分反射会触发类加载</p>
 * <p>2.*new 对象</p>
 * <p>3.*调用类的静态方法</p>
 */
class EagerSingleton {
    private static final String TAG = "EagerSingleton";

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    public static void testOptimize() {
        System.out.println(TAG + " - EagerSingleton.testOptimize -> 问：会不会打印构造方法中的日志？");
    }

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
