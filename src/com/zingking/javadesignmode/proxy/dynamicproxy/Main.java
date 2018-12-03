package com.zingking.javadesignmode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/11/21
 * description：动态代理：不需要实现被代理对象的接口，通过{@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)}方法创建代理类；
 * 代理类中会持有一个被代理的实例，通过反射实现真实对象做事
 * <p>动态代理：主要是为了在不改变原代码理逻辑的情况下增强或者控制对象行为。例如：通过动态代理控制HasMap的key和value不为空</p>
 * <p>AOP：Aspect-Oriented Programing,面向切面编程。</p>
 */
class Main {
    public static void main(String[] args) {
        // 简化版动态代理 -START-
        RealGamePlayer realGamePlayer = new RealGamePlayer("王五");
        IGamePlayer proxyPlayer = (IGamePlayer) Proxy.newProxyInstance(RealGamePlayer.class.getClassLoader(),
                RealGamePlayer.class.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(realGamePlayer, args);
                    }
                });

        proxyPlayer.login("222","123456");
        proxyPlayer.killBoss();
        proxyPlayer.upgrade();
        // 简化版动态代理 -END-
        IGamePlayer proxy = (IGamePlayer) GamePlayerDynamicProxy.createProxy(new RealGamePlayer("赵六"));
        proxy.login("111","654321");
        proxy.killBoss();
        proxy.upgrade();

    }
}
