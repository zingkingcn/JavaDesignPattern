package com.zingking.javadesignmode.builder.product;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
public class CadillacCar extends BaseCar {

    @Override
    protected void start() {
        System.out.println("CadillacCar.start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("CadillacCar.engineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("CadillacCar.alarm");
    }

    @Override
    protected void stop() {
        System.out.println("CadillacCar.stop");
    }

}
