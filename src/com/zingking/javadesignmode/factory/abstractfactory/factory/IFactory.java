package com.zingking.javadesignmode.factory.abstractfactory.factory;

import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.ICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.INpu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：<p>抽象(产品角色)工厂模式</p>
 * <p>抽象工厂和工厂方法基本类似，最大区别就是抽象工厂是一对多，工厂方法是一对一</p>
 * <p>即抽象工厂的工厂中会生产多种产品，工厂方法的工厂只能生产一种产品</p>
 */
public interface IFactory {

    ICpu createCpu();

    INpu createNpu();
}
