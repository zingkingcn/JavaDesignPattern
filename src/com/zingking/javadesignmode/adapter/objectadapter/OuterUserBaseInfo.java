package com.zingking.javadesignmode.adapter.objectadapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工基本信息类
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
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
}
