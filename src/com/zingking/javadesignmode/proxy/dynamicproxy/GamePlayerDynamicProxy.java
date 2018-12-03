package com.zingking.javadesignmode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/3
 * description：
 */
public class GamePlayerDynamicProxy implements InvocationHandler {
    private static final String TAG = "GamePlayerDynamicProxy";
    private Object object;

    private GamePlayerDynamicProxy(Object object) {
        this.object = object;
    }

    public static Object createProxy(Object object) {
        Class<?> aClass = object.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), new GamePlayerDynamicProxy(object));
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        String name = method.getName();
        if ("login".equals(name)){
            System.out.println(TAG + " - GamePlayerDynamicProxy.invoke -> 有人登录了我的账号 ");
        }
        return method.invoke(object, args);
    }
}
