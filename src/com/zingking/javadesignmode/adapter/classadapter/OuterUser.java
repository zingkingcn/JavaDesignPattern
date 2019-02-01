package com.zingking.javadesignmode.adapter.classadapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe:
 */
public class OuterUser implements IOuterUser {
    public static final String KEY_NUM = "job";
    public static final String KEY_PART = "part";
    public static final String KEY_ADDRESS = "address";
    public static final String KEY_NAME = "name";
    public static final String KEY_MOBILE = "mobile";

    @Override
    public Map getUserBaseInfo() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(Integer.MAX_VALUE);
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put(KEY_NAME, "姓名：" + i);
        baseInfoMap.put(KEY_MOBILE, "手机：" + i);
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(999);
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(KEY_NUM, "职位：" + i + "号");
        homeInfoMap.put(KEY_PART, "部门：" + i + "号");
        return homeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(999);
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(KEY_ADDRESS, "幸福国幸福省幸福市幸福县幸福镇幸福村幸福街" + i + "号");
        return homeInfoMap;
    }
}
