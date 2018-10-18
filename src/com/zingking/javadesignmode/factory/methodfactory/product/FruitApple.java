package com.zingking.javadesignmode.factory.methodfactory.product;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/16
 * description：
 */
public class FruitApple implements IFruit {
    @Override
    public void grow() {
        System.out.println("Apple grow.");
    }

    @Override
    public void ripe() {
        System.out.println("Apple ripe.");
    }

    @Override
    public void fade() {
        System.out.println("Apple fade.");
    }
}
