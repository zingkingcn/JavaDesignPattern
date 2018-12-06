package com.zingking.javadesignmode.state;

import java.util.concurrent.locks.StampedLock;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public abstract class AbstractLiftState {

    StateManager stateManager;

    public final void setStateManager(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();

}
