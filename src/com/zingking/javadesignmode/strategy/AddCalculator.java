package com.zingking.javadesignmode.strategy;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/1/31
 * description：加法策略类
 */
class AddCalculator implements ICalculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
