package com.zingking.javadesignmode.adapter.classadapter;

import java.util.Map;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/30
 * Describe: 模拟外部系统员工信息
 */
public interface IOuterUser {

    /**
     * 获取员工基本信息，姓名手机号等
     * @return 员工基本信息
     */
    Map getUserBaseInfo();

    /**
     * 获取员工工作信息，如职位，薪资等
     * @return 员工工作信息
     */
    Map getUserOfficeInfo();

    /**
     * 获取员工家庭信息，如地址，座机等
     * @return 员工家庭信息
     */
    Map getUserHomeInfo();







}
