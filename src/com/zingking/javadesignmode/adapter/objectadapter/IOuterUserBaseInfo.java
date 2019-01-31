package com.zingking.javadesignmode.adapter.objectadapter;

import java.util.Map;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工基本信息接口
 */
public interface IOuterUserBaseInfo {

    /**
     * 获取员工基本信息，姓名、手机号等
     * @return 员工基本信息
     */
    Map getUserBaseInfo();
}
