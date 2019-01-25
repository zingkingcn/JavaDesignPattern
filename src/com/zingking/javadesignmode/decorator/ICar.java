package com.zingking.javadesignmode.decorator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/24
 * Describe:
 */
public interface ICar {

    /**
     * 展示车辆外观方法
     */
    void showCar();

    /**
     * 开走方法
     */
    void run();

    /**
     * 车的价格
     * @return
     */
    int getPrice();
}
