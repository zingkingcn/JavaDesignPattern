package com.zingking.javadesignmode.templatemethod.car;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/21
 * description：
 */
class Main {
    public static void main(String[] args){
        CadillacCar cadillacCar = new CadillacCar();
        cadillacCar.setAlarm(false);
        cadillacCar.run();

        BenzCar benzCar = new BenzCar();
        benzCar.setAlarm(true);
        benzCar.run();
    }
}
