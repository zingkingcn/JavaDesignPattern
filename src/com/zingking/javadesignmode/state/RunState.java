package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class RunState extends AbstractLiftState {
    @Override
    public void open() {
        System.out.println("DANGEROUS!Current is running,you can not open.");
    }

    @Override
    public void close() {
        System.out.println("Current is running,is close.");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void stop() {
        this.stateManager.changeState(StateManager.STOP_STATE);
        stateManager.getCurrLiftState().stop();
    }
}
