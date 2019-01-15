package com.zingking.javadesignmode.builder.standard;

import com.zingking.javadesignmode.builder.standard.builders.IBuilder;
import com.zingking.javadesignmode.builder.standard.product.BaseCar;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：导演类，负责指挥建造生产产品
 */
public class Director {

    private IBuilder iBuilder;

    public void setBuilder(IBuilder builder) {
        this.iBuilder = builder;
    }

    /**
     * 构建 S 级奔驰
     */
    public BaseCar constructSBenz(){
        iBuilder.buildKey();
        iBuilder.buildEngine();
        iBuilder.buildBrake();
        return iBuilder.retrieveResult();
    }

    /**
     * 构建 A 级奔驰
     */
    public BaseCar constructABenz(){
        iBuilder.buildKey();
        iBuilder.buildEngine();
        iBuilder.buildTrumpet();
        iBuilder.buildBrake();
        return iBuilder.retrieveResult();
    }

    /**
     * 构建 Cadillac XTS
     */
    public BaseCar constructXTS(){
        iBuilder.buildKey();
        iBuilder.buildTrumpet();
        iBuilder.buildEngine();
        iBuilder.buildBrake();
        return iBuilder.retrieveResult();
    }

    /**
     * 构建 Cadillac XT5
     */
    public BaseCar contructXT5(){
        iBuilder.buildKey();
        iBuilder.buildBrake();
        return iBuilder.retrieveResult();
    }

}
