package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：使用静态内部类用到单例的时候才去创建，节省空间???
 */
class OptimizeEagerSingleton {
    private static final String TAG = "OptimizeEagerSingleton";

    public static class Holder {
        public static OptimizeEagerSingleton optimizeEagerSingleton = new OptimizeEagerSingleton();
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
