package com.zingking.javadesignmode.factory.abstractfactory.factory;

import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.HUAWEICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.ICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.HUAWEINpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.INpu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：
 */
public class HUAWEIFactory implements IFactory {
    @Override
    public ICpu createCpu() {
        return new HUAWEICpu();
    }

    @Override
    public INpu createNpu() {
        return new HUAWEINpu();
    }
}
