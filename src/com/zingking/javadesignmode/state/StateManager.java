package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class StateManager {
    private AbstractLiftState iLiftState = null;

    public static final AbstractLiftState OPEN_STATE = new OpenState();
    public static final AbstractLiftState CLOSE_STATE = new CloseState();
    public static final AbstractLiftState RUN_STATE = new RunState();
    public static final AbstractLiftState STOP_STATE = new StopState();

    public void changeState(AbstractLiftState iLiftState) {
        this.iLiftState = iLiftState;
        this.iLiftState.setStateManager(this);
    }

    public AbstractLiftState getCurrLiftState(){
        return iLiftState;
    }

//    public AbstractLiftState getiLiftState() {
//        return iLiftState;
//    }
    public void open(){
        iLiftState.open();
    }

    public void close(){
        iLiftState.close();
    }

    public void run(){
        iLiftState.run();
    }
    public void stop(){
        iLiftState.stop();

    }
}
