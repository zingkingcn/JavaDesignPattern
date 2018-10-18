package com.zingking.javadesignmode.factory.methodfactory.factory;

import com.zingking.javadesignmode.factory.methodfactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/18
 * description：<p>抽象工厂角色-核心</p>
 * <p>定义了工厂该做的事，而没有实现，具体实现交给具体工厂(子类)实现</p>
 */
public interface IFactory {
    IFruit createFruit();
}
