package com.zingking.javadesignmode.adapter.objectadapter;

import java.util.Map;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工工作信息接口
 */
public interface IOuterUserOfficeInfo {
    /**
     * 获取员工工作信息，职位、薪资等
     * @return 员工工作信息
     */
    Map getUserOfficeInfo();
}
