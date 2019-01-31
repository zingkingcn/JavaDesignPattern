package com.zingking.javadesignmode.strategy;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/1/31
 * description：场景测试类
 */
class StrategyMain {
    private static final String TAG = "StrategyMain";

    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();
        Context context = new Context(addCalculator);
        int exec = context.exec(1, 1);
        System.out.println(TAG + " - StrategyMain.main -> exec = " + exec);

        SubtractionCalculator subtractionCalculator = new SubtractionCalculator();
        context = new Context(subtractionCalculator);
        int exec1 = context.exec(1, 1);
        System.out.println(TAG + " - StrategyMain.main -> exec1 = " + exec1);

    }
}
