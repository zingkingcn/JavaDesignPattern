package com.zingking.javadesignmode.factory.methodfactory.factory;

import com.zingking.javadesignmode.factory.methodfactory.product.FruitNewApple;
import com.zingking.javadesignmode.factory.methodfactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/18
 * description：
 */
public class FactoryNewApple implements IFactory {
    @Override
    public IFruit createFruit() {
        return new FruitNewApple();
    }
}
