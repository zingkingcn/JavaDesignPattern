package com.zingking.javadesignmode.decorator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 真皮装饰类，真皮座椅 + 按喇叭
 */
public class LeatherDecorator extends Decorator {

    public LeatherDecorator(ICar iCar) {
        super(iCar);
    }

    private void doDecorator() {
        System.out.println("---> 加真皮座椅.");
    }

    @Override
    public void showCar() {
        doDecorator();
        super.showCar();
    }

    @Override
    public void run() {
        System.out.println("---> 按喇叭.");
        super.run();
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
