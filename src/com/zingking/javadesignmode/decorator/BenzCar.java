package com.zingking.javadesignmode.decorator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/24
 * Describe:
 */
public class BenzCar implements ICar {
    @Override
    public void showCar() {
        System.out.println("====> 去车展展示。");
    }

    @Override
    public void run() {
        System.out.println("====> 有人开走了。");
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
