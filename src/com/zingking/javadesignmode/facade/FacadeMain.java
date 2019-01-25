package com.zingking.javadesignmode.facade;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 场景测试类
 */
public class FacadeMain {
    public static void main(String[] args){
        HospitalFacade instance = HospitalFacade.getInstance();
        String comeHospital = instance.comeHospital("李四");
        System.out.println("拿到的药是：" + comeHospital);
    }

}
