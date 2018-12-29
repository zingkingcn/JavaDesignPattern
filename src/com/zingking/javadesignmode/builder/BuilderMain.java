package com.zingking.javadesignmode.builder;

import com.zingking.javadesignmode.builder.builders.BenzBuilder;
import com.zingking.javadesignmode.builder.builders.CadillacBuilder;
import com.zingking.javadesignmode.builder.product.BaseCar;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：
 */
class BuilderMain {
    public static void main(String[] args) {
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

        // TODO: 2018/12/29 退化的建造者模式 + 链式调用 by Z.kai

    }
}
