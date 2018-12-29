package com.zingking.javadesignmode.builder.product;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：汽车的抽象类
 */
public abstract class BaseCar {

    ArrayList<String> carParts;
    public static final String PART_KEY = "KEY";
    public static final String PART_ENGINE = "ENGINE ";
    public static final String PART_TRUMPET = "TRUMPET";
    public static final String PART_BRAKE = "BRAKE ";


    protected abstract void start();

    protected abstract void engineBoom();

    protected abstract void alarm();

    protected abstract void stop();

    public final void run() {
        for (String carPart : carParts) {
            if (PART_KEY.equals(carPart)) {
                start();
            } else if (PART_ENGINE.equals(carPart)) {
                engineBoom();
            } else if (PART_TRUMPET.equals(carPart)) {
                alarm();
            } else if (PART_BRAKE.equals(carPart)) {
                stop();
            }
        }
    }

    public void setCarPart(ArrayList<String> carParts) {
        this.carParts = carParts;
    }

}
