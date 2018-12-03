package com.zingking.javadesignmode.proxy.dynamicproxy;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/11/21
 * description：
 */
public class RealGamePlayer implements IGamePlayer {
    String name;

    public RealGamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String account, String password) {
        System.out.println("用户：" + name + " 账号：" + account + " 登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(name + "击杀Boss!");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "升级!");
    }
}
