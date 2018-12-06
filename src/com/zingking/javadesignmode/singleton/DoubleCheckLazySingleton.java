package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/6
 * description：{@link LazySingleton} 直接同步获取单例对象方法，在多线程中，同步的开销太大可以用双重检查优化
 */
public class DoubleCheckLazySingleton {
    private static final String TAG = "DoubleCheckLazySingleton";

    private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton = null;

    private DoubleCheckLazySingleton() {
        System.out.println(TAG + "DoubleCheckLazySingleton() called");
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (doubleCheckLazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                // 如果doubleCheckLazySingleton为空，多个线程卡在了加锁这里，没有下面判空的话还是会有多个对象的
                try {
                    Thread.sleep(1500);// 这里加休眠是测试一下上面那句话(模拟创建对象耗时)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (doubleCheckLazySingleton == null) {
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return doubleCheckLazySingleton;
    }

    public void printSomething() {
        System.out.println("I'm double check lazy singleton.");
    }


}
