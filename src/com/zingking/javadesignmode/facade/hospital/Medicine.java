package com.zingking.javadesignmode.facade.hospital;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/25
 * Describe: 药房，负责抓药
 */
public class Medicine {

    public String getMedicine(){
        System.out.println("---> 取药。");
        return "感冒冲剂";
    }

}
