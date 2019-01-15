package com.zingking.javadesignmode.builder;

import com.zingking.javadesignmode.builder.chained.product.BenzCar;
import com.zingking.javadesignmode.builder.standard.Director;
import com.zingking.javadesignmode.builder.standard.builders.BenzBuilder;
import com.zingking.javadesignmode.builder.standard.builders.CadillacBuilder;
import com.zingking.javadesignmode.builder.standard.product.BaseCar;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：
 */
class BuilderMain {
    private static final String TAG = "BuilderMain";
    public static void main(String[] args) {
        System.out.println(TAG + " - BuilderMain.main -> 标准的建造者 ");
        // 标准建造者
        Director director = new Director();
        BenzBuilder benzBuilder = new BenzBuilder();
        director.setBuilder(benzBuilder);
        BaseCar baseCar = director.constructABenz();
        baseCar.run();
        BaseCar baseCar1 = director.constructSBenz();
        baseCar1.run();

        CadillacBuilder cadillacBuilder = new CadillacBuilder();
        director.setBuilder(cadillacBuilder);
        BaseCar baseCar2 = director.contructXT5();
        baseCar2.run();
        BaseCar baseCar3 = director.constructXTS();
        baseCar3.run();

        System.out.println(TAG + " - BuilderMain.main -> 退化的建造者 ");
        // 退化的建造者，省略建造者接口和导演类
        com.zingking.javadesignmode.builder.simple.builders.BenzBuilder builder = new com.zingking.javadesignmode.builder.simple.builders.BenzBuilder();
        BaseCar baseCar4 = builder.constructABenz();
        baseCar4.run();
        BaseCar baseCar5 = builder.constructSBenz();
        baseCar5.run();

        System.out.println(TAG + " - BuilderMain.main -> 链式调用 ");
        // 链式调用
        BenzCar.Builder builder1 = new BenzCar.Builder();
        com.zingking.javadesignmode.builder.chained.product.BaseCar baseCar6 = builder1.constructABenz();
        baseCar6.run();

        com.zingking.javadesignmode.builder.chained.product.BaseCar baseCar7 = builder1.buildBrake()
                .buildKey()
                .buildBrake()
                .retrieveResult();
        baseCar7.run();
    }
}
