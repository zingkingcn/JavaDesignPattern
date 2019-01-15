package com.zingking.javadesignmode.builder.chained.product;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
public class BenzCar extends BaseCar {

    @Override
    protected void start() {
        System.out.println("BenzCar.start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BenzCar.engineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("BenzCar.alarm");
    }

    @Override
    protected void stop() {
        System.out.println("BenzCar.stop");
    }


    public static class Builder {
        ArrayList<String> carParts = new ArrayList<>();

        public Builder buildKey() {
            carParts.add(BaseCar.PART_KEY);
            return this;
        }

        public Builder buildEngine() {
            carParts.add(BaseCar.PART_ENGINE);
            return this;
        }

        public Builder buildTrumpet() {
            carParts.add(BaseCar.PART_TRUMPET);
            return this;
        }

        public Builder buildBrake() {
            carParts.add(BaseCar.PART_BRAKE);
            return this;
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
}
