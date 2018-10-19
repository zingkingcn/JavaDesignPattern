package com.zingking.javadesignmode.factory.abstractfactory.product.cpu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：
 */
public class HUAWEICpu implements ICpu {
    private static final String TAG = "HUAWEICpu";

    @Override
    public void framework() {
        System.out.println(TAG + "framework() called");
    }

    @Override
    public void core() {
        System.out.println(TAG + "core() called");
    }
}
