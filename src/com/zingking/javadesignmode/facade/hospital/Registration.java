package com.zingking.javadesignmode.facade.hospital;

import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 挂号处，挂号排队等流程
 */
public class Registration {
    private int index = -1;
    /**
     * 挂号方法
     */
    public void register(){
        Random random = new Random(System.nanoTime());
        index = random.nextInt(500);
        System.out.println("--> 挂号排队，你的号码为: " + index);
    }

    public int getIndex() {
        return index;
    }
}
