package com.zingking.javadesignmode.factory.methodfactory.product;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/16
 * description：
 */
public class FruitStrawberry implements IFruit {
    @Override
    public void grow() {
        System.out.println("Strawberry grow.");
    }

    @Override
    public void ripe() {
        System.out.println("Strawberry ripe.");
    }

    @Override
    public void fade() {
        System.out.println("Strawberry fade.");
    }
}
