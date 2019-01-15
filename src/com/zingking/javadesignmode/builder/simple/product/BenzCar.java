package com.zingking.javadesignmode.builder.simple.product;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
public class BenzCar extends BaseCar {

    @Override
    protected void start() {
        System.out.println("BenzCar.start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BenzCar.engineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("BenzCar.alarm");
    }

    @Override
    protected void stop() {
        System.out.println("BenzCar.stop");
    }

}
