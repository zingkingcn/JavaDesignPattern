package com.zingking.javadesignmode.factory.methodfactory.factory;

import com.zingking.javadesignmode.factory.methodfactory.product.FruitApple;
import com.zingking.javadesignmode.factory.methodfactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/18
 * description：<p>具体工厂，苹果工厂</p>
 * <p>继承抽象工厂，实现抽象工厂中的方法</p>
 */
public class FactoryApple implements IFactory {
    @Override
    public IFruit createFruit() {
        return new FruitApple();
    }
}
