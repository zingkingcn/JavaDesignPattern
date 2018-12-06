package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class OpenState extends AbstractLiftState {
    @Override
    public void open() {
        System.out.println("Open...");
    }

    @Override
    public void close() {
        super.stateManager.changeState(StateManager.CLOSE_STATE);
        super.stateManager.getCurrLiftState().close();
    }

    @Override
    public void run() {
        System.out.println("Current is Open.YOU CAN'T SWITCH TO RUN!!");
    }

    @Override
    public void stop() {
        System.out.println("Current is Open,is stop.");
    }
}
