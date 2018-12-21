package com.zingking.javadesignmode.templatemethod.car;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：汽车的抽象类
 */
abstract class BaseCar {
    protected abstract void start();

    protected abstract void engineBoom();

    protected abstract void alarm();

    protected abstract void stop();

    public final void run() {
        start();
        engineBoom();
        if (isNeedAlarm()) {
            alarm();
        }
        stop();
    }

    public boolean isNeedAlarm() {
        return true;
    }

}
