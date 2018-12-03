package com.zingking.javadesignmode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/11/20
 * description：
 */
public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    public static Object factory(Object obj){
        Class<?> aClass = obj.getClass();
        return  Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(), new VectorProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        if (args != null) {
            for (int i = 0, len = args.length; i < len; i++) {
                System.out.println(args[i]);
            }
        }

        Object invoke = method.invoke(proxyObj, args);
        System.out.println("after calling " + method);
        return invoke;
    }


    public static void main(String[] args){
        List list = (List) factory(new Vector(10));
        list.add("new");
        list.add("york");

    }
}
