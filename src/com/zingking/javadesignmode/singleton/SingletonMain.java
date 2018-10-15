package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：
 */
class SingletonMain {
    public static void main(String[] args) {
        SingletonMain main = new SingletonMain();
        main.testEagerSingleton();
        main.testOptimizeEagerSingleton();
        main.testLazySingleton();
        main.testRegisterSingleton();
    }

    public void testEagerSingleton() {
        EagerSingleton.getInstance().printSomething();
    }

    public void testOptimizeEagerSingleton(){
        OptimizeEagerSingleton.getInstance().printSomething();
    }

    public void testLazySingleton() {
        LazySingleton.getInstance().printSomething();
    }

    public void testRegisterSingleton(){
        RegisterChildSingleton.getInstance("com.zingking.javadesignmode.singleton.RegisterChildSingleton").printSomething();
        RegisterChildSingleton.getInstance("").printSomething();
    }

}
