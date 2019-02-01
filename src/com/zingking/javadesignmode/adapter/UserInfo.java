package com.zingking.javadesignmode.adapter;

import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 员工信息类，target角色
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        return "*姓名：" + getRandom(100);
    }

    @Override
    public String getHomeAddress() {
        return "*住址：幸福路" + getRandom(200) + "号";
    }

    @Override
    public String getMobileNumber() {
        return "*手机号码：" + getRandom(300);
    }

    @Override
    public String getJopPart() {
        return "*部门：" + getRandom(400);
    }

    private int getRandom(int range){
        Random random = new Random(System.nanoTime());
        return random.nextInt(range);
    }
}
