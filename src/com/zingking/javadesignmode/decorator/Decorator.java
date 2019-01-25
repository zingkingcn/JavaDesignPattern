package com.zingking.javadesignmode.decorator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/24
 * Describe: 抽象装饰类，包装一个真实的对象
 */
public abstract class Decorator implements ICar {
    private ICar iCar;

    public Decorator(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void showCar() {
        iCar.showCar();
    }

    @Override
    public void run() {
        iCar.run();
    }

    @Override
    public int getPrice() {
        return iCar.getPrice();
    }
}
