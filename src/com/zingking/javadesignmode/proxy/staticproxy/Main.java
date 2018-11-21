package com.zingking.javadesignmode.proxy.staticproxy;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/11/21
 * description：
 */
class Main {
    public static void main(String[] args) {
        /** 这里是创建了一个用户并交给代理类，实际可以在创建用户的过程放到代理类中 {@link GamePlayerProxyV2} */
        IGamePlayer iGamePlayer = new RealGamePlayer("张三");
        GamePlayerProxy proxy = new GamePlayerProxy(iGamePlayer);
        proxy.login("222", "3333");
        proxy.killBoss();
        proxy.upgrade();

        GamePlayerProxyV2 proxyV2 = new GamePlayerProxyV2("李四");
        proxyV2.login("1111", "3333");
        proxyV2.killBoss();
        proxyV2.upgrade();
    }
}
