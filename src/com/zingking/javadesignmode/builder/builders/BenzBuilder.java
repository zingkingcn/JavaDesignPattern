package com.zingking.javadesignmode.builder.builders;

import com.zingking.javadesignmode.builder.product.BaseCar;
import com.zingking.javadesignmode.builder.product.BenzCar;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：
 */
public class BenzBuilder implements IBuilder {
    ArrayList<String> carParts = new ArrayList<>();

    @Override
    public void buildKey() {
        carParts.add(BaseCar.PART_KEY);
    }

    @Override
    public void buildEngine() {
        carParts.add(BaseCar.PART_ENGINE);
    }

    @Override
    public void buildTrumpet() {
        carParts.add(BaseCar.PART_TRUMPET);
    }

    @Override
    public void buildBrake() {
        carParts.add(BaseCar.PART_BRAKE);
    }

    @Override
    public BaseCar retrieveResult() {
        BenzCar benzCar = new BenzCar();
        benzCar.setCarPart((ArrayList<String>) carParts.clone());
        this.carParts.clear();
        return benzCar;
    }


}
