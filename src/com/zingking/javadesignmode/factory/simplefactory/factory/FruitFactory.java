package com.zingking.javadesignmode.factory.simplefactory.factory;

import com.zingking.javadesignmode.factory.simplefactory.product.FruitApple;
import com.zingking.javadesignmode.factory.simplefactory.product.FruitOrange;
import com.zingking.javadesignmode.factory.simplefactory.product.FruitStrawberry;
import com.zingking.javadesignmode.factory.simplefactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/16
 * description：<p>工厂类</p>
 * <p>根据传入的参数生产不同的产品</p>
 */
public class FruitFactory {
    public static IFruit createFruit(String fruitSpecies) {
        switch (fruitSpecies) {
            case "apple":
                return new FruitApple();
            case "orange":
                return new FruitOrange();
            case "strawberry":
                return new FruitStrawberry();
            default:
                return null;
        }
    }
}
