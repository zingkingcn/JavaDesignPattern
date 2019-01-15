package com.zingking.javadesignmode.builder.standard.builders;

import com.zingking.javadesignmode.builder.standard.product.BaseCar;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：抽象建造者规范产品的组成部分
 */
public interface IBuilder {

    /**
     * 建造钥匙，有钥匙才能start
     */
    void buildKey();

    /**
     * 建造引擎，有引擎才能engineBoom
     */
    void buildEngine();

    /**
     * 建造喇叭，有喇叭才能alarm
     */
    void buildTrumpet();

    /**
     * 建造刹车，有刹车才能stop
     */
    void buildBrake();

    BaseCar retrieveResult();

}
