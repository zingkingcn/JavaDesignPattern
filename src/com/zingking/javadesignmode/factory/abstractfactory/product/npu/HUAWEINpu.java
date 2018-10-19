package com.zingking.javadesignmode.factory.abstractfactory.product.npu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：
 */
public class HUAWEINpu implements INpu {
    private static final String TAG = "HUAWEINpu";

    @Override
    public void size() {
        System.out.println(TAG + "size() called");
    }

    @Override
    public void version() {
        System.out.println(TAG + "version() called");
    }
}
