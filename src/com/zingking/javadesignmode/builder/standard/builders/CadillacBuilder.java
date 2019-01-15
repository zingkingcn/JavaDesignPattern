package com.zingking.javadesignmode.builder.standard.builders;

import com.zingking.javadesignmode.builder.standard.product.BaseCar;
import com.zingking.javadesignmode.builder.standard.product.CadillacCar;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/29
 * description：
 */
public class CadillacBuilder implements IBuilder {
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
        CadillacCar cadillacCar = new CadillacCar();
        cadillacCar.setCarPart((ArrayList<String>) carParts.clone());
        this.carParts.clear();
        return cadillacCar;
    }


}
