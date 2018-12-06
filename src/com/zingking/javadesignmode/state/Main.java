package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class Main {
    public static void main(String[] args){
        StateManager stateManager = new StateManager();
        stateManager.changeState(StateManager.OPEN_STATE);
        stateManager.open();
//        stateManager.close();
//        stateManager.run();
//        stateManager.run();
//        stateManager.run();
//        stateManager.run();
//        stateManager.open();
//        stateManager.stop();
//        stateManager.open();
//        stateManager.run();
//        stateManager.close();
        stateManager.open();
        stateManager.stop();
    }
}
