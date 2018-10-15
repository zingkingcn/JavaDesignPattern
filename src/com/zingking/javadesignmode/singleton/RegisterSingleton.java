package com.zingking.javadesignmode.singleton;

import com.zingking.javadesignmode.TextUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：<p>登记式单例模式</p>
 * <p>特点：可有子类继承</p>
 * <p>缺点：子类构造方法为public，可直接被new出对象，应该不算是单例了。父类构造方法为包级可访问，也可被直接new出对象，不算是单例</p>
 */
class RegisterSingleton {
    private static Map<String, RegisterSingleton> singletonMap = new HashMap<>();

    RegisterSingleton(){

    }

    public static RegisterSingleton getInstance(String className){
        RegisterSingleton singleton = singletonMap.get(className);
        if (TextUtils.isEmpty(className)) {
            className = "com.zingking.javadesignmode.singleton.RegisterSingleton";
        }
        if (singleton == null) {
            try {
                singletonMap.put(className, (RegisterSingleton) Class.forName(className).newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return singletonMap.get(className);
    }

    public void printSomething(){
        System.out.println("我是登记式单例的父类");
    }

}
