package com.zingking.javadesignmode.strategy;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/1/31
 * description：抽象的strategy类
 */
interface ICalculator {

    /**
     * 计算传入的两个值
     * @return 计算结果
     */
    int calc(int a, int b);
}
