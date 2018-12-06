package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：
 */
class SingletonMain {
    // TODO: 2018/10/15 优缺点及适用场景 https://www.cnblogs.com/damsoft/p/6105122.html by Z.kai
    public static void main(String[] args) {
//        SingletonMain main = new SingletonMain();
//        main.testEagerSingleton();
//        main.testOptimizeEagerSingleton();
//        main.testLazySingleton();
//        main.testRegisterSingleton();

        EagerSingleton.testOptimize();
        OptimizeEagerSingleton.testOptimize();

        // 双重检查的单例模式 -START-
//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> {
//                DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();
//                System.out.println("instance = " + instance);
//                instance.printSomething();
//            }).start();
//        }
        // 双重检查的单例模式 -END-
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
