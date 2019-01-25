package com.zingking.javadesignmode.decorator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 场景测试类
 */
public class DecoratorMain {
    public static void main(String[] args){
        ICar benzCar = new BenzCar();
        benzCar = new LeatherDecorator(benzCar);
        benzCar = new SkylightDecorator(benzCar);
        benzCar.showCar();
        int price = benzCar.getPrice();
        System.out.println("==== price ====> " + price);
        benzCar.run();
    }
}
