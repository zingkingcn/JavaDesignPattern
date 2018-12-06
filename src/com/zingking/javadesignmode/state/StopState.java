package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class StopState extends AbstractLiftState {
    @Override
    public void open() {
        stateManager.changeState(StateManager.OPEN_STATE);
        stateManager.getCurrLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("Current is stop,is close.");
    }

    @Override
    public void run() {
        stateManager.changeState(StateManager.RUN_STATE);
        stateManager.getCurrLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("Stop...");
    }
}
