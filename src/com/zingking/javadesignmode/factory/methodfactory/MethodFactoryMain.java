package com.zingking.javadesignmode.factory.methodfactory;

import com.zingking.javadesignmode.factory.methodfactory.factory.FactoryApple;
import com.zingking.javadesignmode.factory.methodfactory.factory.IFactory;
import com.zingking.javadesignmode.factory.methodfactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/18
 * description：<p>工厂方法模式</p>
 * <p>特点：1.工厂核心(抽象工厂)不需要知道所有的具体产品，只需要定义该生产哪种产品；</p>
 * <p>2.*增加产品时不需要修改工厂核心，只需要增加工厂和对应的产品，而简单工厂模式不具备该特点</p>
 * <p>3.工厂和产品一一对应，一个工厂只生产一种产品</p>
 */
class MethodFactoryMain {
    public static void main(String[] args) {
        IFactory iFactory = new FactoryApple();
        IFruit fruit = iFactory.createFruit();
        if (fruit != null) {
            fruit.grow();
            fruit.ripe();
            fruit.fade();
        }
    }
}
