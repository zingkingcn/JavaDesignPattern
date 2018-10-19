package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：<p>优化后的饿汉式单例</p>
 * <p>使用静态内部类,用到单例的时候才去实例化 {@link Holder#optimizeEagerSingleton},
 * 即加载类 {@link Holder}的时候才会实例化{@link Holder#optimizeEagerSingleton}，节省空间；对比效果请调用{@link OptimizeEagerSingleton#testOptimize()}</p>
 *
 * <p>解释：在调用静态方法{@link OptimizeEagerSingleton#testOptimize()}时，会触发类{@link OptimizeEagerSingleton}的加载，
 * 但在该类中没有实例化{@link OptimizeEagerSingleton}的实例，所以不会打印构造方法中的日志，所以没有占用空间。-没有用到实例对象，没有实例化对象，不浪费空间</p>
 */
class OptimizeEagerSingleton {
    private static final String TAG = "OptimizeEagerSingleton";

    public static class Holder {
        public static OptimizeEagerSingleton optimizeEagerSingleton = new OptimizeEagerSingleton();
    }

    public static void testOptimize() {
        System.out.println(TAG + " - OptimizeEagerSingleton.testOptimize ->  问：会不会打印构造方法中的日志？ ");
    }

    private OptimizeEagerSingleton() {
        System.out.println(TAG + "OptimizeEagerSingleton() called");
    }

    public static OptimizeEagerSingleton getInstance() {
        return Holder.optimizeEagerSingleton;
    }

    public void printSomething() {
        System.out.println("I'm optimize eager singleton.");
    }


}
