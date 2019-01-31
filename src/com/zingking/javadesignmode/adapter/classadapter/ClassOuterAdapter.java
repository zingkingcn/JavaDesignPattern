package com.zingking.javadesignmode.adapter.classadapter;

import com.zingking.javadesignmode.adapter.IUserInfo;

import java.util.Map;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 类适配器
 */
public class ClassOuterAdapter extends OuterUser implements IUserInfo {

    private Map userBaseInfo;
    private Map userHomeInfo;
    private Map userOfficeInfo;

    public ClassOuterAdapter() {
        userBaseInfo = getUserBaseInfo();
        userHomeInfo = getUserHomeInfo();
        userOfficeInfo = getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        return (String) userBaseInfo.get(OuterUser.KEY_NAME);
    }

    @Override
    public String getHomeAddress() {
        return (String) userHomeInfo.get(OuterUser.KEY_ADDRESS);
    }

    @Override
    public String getMobileNumber() {
        return (String) userBaseInfo.get(OuterUser.KEY_MOBILE);
    }

    @Override
    public String getJopPart() {
        return (String) userOfficeInfo.get(OuterUser.KEY_PART);
    }
}
