package com.zingking.javadesignmode.builder.simple.builders;

import com.zingking.javadesignmode.builder.standard.product.BaseCar;
import com.zingking.javadesignmode.builder.standard.product.BenzCar;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：
 */
public class BenzBuilder {
    ArrayList<String> carParts = new ArrayList<>();

    public void buildKey() {
        carParts.add(BaseCar.PART_KEY);
    }

    public void buildEngine() {
        carParts.add(BaseCar.PART_ENGINE);
    }

    public void buildTrumpet() {
        carParts.add(BaseCar.PART_TRUMPET);
    }

    public void buildBrake() {
        carParts.add(BaseCar.PART_BRAKE);
    }

    public BaseCar retrieveResult() {
        BenzCar benzCar = new BenzCar();
        benzCar.setCarPart((ArrayList<String>) carParts.clone());
        this.carParts.clear();
        return benzCar;
    }

    /**
     * 构建 S 级奔驰
     */
    public BaseCar constructSBenz() {
        this.buildKey();
        this.buildEngine();
        this.buildBrake();
        return this.retrieveResult();
    }

    /**
     * 构建 A 级奔驰
     */
    public BaseCar constructABenz() {
        this.buildKey();
        this.buildEngine();
        this.buildTrumpet();
        this.buildBrake();
        return this.retrieveResult();
    }

}
