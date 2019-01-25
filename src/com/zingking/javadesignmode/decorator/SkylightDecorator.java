package com.zingking.javadesignmode.decorator;

import java.lang.reflect.ParameterizedType;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 天窗装饰类，天窗 + 转向灯
 */
public class SkylightDecorator extends Decorator {
    private static final String TAG = "SkylightDecorator";

    public SkylightDecorator(ICar iCar) {
        super(iCar);
    }

    private void doDecorator() {
        System.out.println(TAG +": ---> 增加天窗.");
    }

    @Override
    public void showCar() {
        doDecorator();
        super.showCar();
    }

    @Override
    public void run() {
        System.out.println(TAG + ": ---> 转向灯亮");
        super.run();
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 200;
    }
}
