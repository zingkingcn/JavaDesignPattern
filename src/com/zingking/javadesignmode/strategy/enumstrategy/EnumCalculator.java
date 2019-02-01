package com.zingking.javadesignmode.strategy.enumstrategy;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/2/1
 * Describe: 策略枚举
 */
// TODO: 2019/2/1 没懂策略模式体现在哪里 by Z.kai
public enum EnumCalculator {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    }, SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    private String calc;

    private EnumCalculator(String calc) {
        this.calc = calc;
    }

    public abstract int exec(int a, int b);

}
