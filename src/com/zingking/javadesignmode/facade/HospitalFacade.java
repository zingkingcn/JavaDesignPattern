package com.zingking.javadesignmode.facade;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.zingking.javadesignmode.facade.hospital.*;

import javax.lang.model.SourceVersion;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 医院门面类，类似接待处
 */
public class HospitalFacade {
    /**
     * 挂号
     */
    private Registration registration;
    /**
     * 问诊
     */
    private Diagnose diagnose;

    /**
     * 化验
     */
    private Assay assay;

    /**
     * 缴费
     */
    private Charge charge;

    /**
     * 抓药
     */
    private Medicine medicine;

    private static HospitalFacade hospitalFacade;

    private HospitalFacade() {
        registration = new Registration();
        diagnose = new Diagnose();
        assay = new Assay();
        charge = new Charge();
        medicine = new Medicine();
    }

    public static HospitalFacade getInstance(){
        if (hospitalFacade == null) {
            synchronized (HospitalFacade.class){
                if (hospitalFacade == null) {
                    hospitalFacade = new HospitalFacade();
                }
            }
        }
        return hospitalFacade;

    }

    public String comeHospital(String name){
        int currIndex = 0;
        registration.register();
        int index = registration.getIndex();
        while (currIndex < index) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currIndex += 10;
            System.out.println("当前诊断的号码为：" + currIndex);
        }
        System.out.println(name + " 开始诊断...");
        diagnose.check();
        assay.assaying();
        charge.chargeMoney(100);
        return medicine.getMedicine();


    }
}
