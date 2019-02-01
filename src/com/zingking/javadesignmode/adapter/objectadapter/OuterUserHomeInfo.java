package com.zingking.javadesignmode.adapter.objectadapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工家庭信息类
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public static final String KEY_ADDRESS = "address";

    @Override
    public Map getUserHomeInfo() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(999);
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(KEY_ADDRESS, "幸福国幸福省幸福市幸福县幸福镇幸福村幸福街" + i + "号");
        return homeInfoMap;
    }
}
