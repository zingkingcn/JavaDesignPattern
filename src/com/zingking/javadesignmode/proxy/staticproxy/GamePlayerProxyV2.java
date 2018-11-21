package com.zingking.javadesignmode.proxy.staticproxy;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/11/21
 * description：
 */
public class GamePlayerProxyV2 implements IGamePlayer {

    IGamePlayer iGamePlayer;

    public GamePlayerProxyV2(String name) {
        iGamePlayer = new RealGamePlayer(name);
    }

    @Override
    public void login(String account, String password) {
        System.out.println("有用户开始登录了，客服准备上线");
        this.iGamePlayer.login(account, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
        
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
        payMoney(22);
    }

    private void payMoney(int money){
        System.out.println("需要付费 " + money + " 元。");
    }

}
