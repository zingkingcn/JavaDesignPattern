package com.zingking.javadesignmode.factory.abstractfactory.factory;

import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.ICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.XIAOMICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.INpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.XIAOMINpu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：
 */
public class XIAOMIFactory implements IFactory {

    @Override
    public ICpu createCpu() {
        return new XIAOMICpu();
    }

    @Override
    public INpu createNpu() {
        return new XIAOMINpu();
    }
}
