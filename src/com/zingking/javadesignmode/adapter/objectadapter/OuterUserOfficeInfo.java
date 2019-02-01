package com.zingking.javadesignmode.adapter.objectadapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工工作信息类
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    public static final String KEY_NUM = "job";
    public static final String KEY_PART = "part";

    @Override
    public Map getUserOfficeInfo() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(999);
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put(KEY_NUM, "职位：" + i + "号");
        homeInfoMap.put(KEY_PART, "部门：" + i + "号");
        return homeInfoMap;
    }
}
