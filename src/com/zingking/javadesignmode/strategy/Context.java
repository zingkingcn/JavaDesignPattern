package com.zingking.javadesignmode.strategy;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/1/31
 * description：封装策略的类
 */
class Context {

    private ICalculator iCalculator;

    public Context(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public int exec(int a, int b) {
        return iCalculator.calc(a, b);
    }
}
