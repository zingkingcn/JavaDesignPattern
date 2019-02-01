package com.zingking.javadesignmode.adapter.objectadapter;

import com.zingking.javadesignmode.adapter.IUserInfo;
import com.zingking.javadesignmode.adapter.classadapter.OuterUser;

import java.util.Map;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 对象适配器
 */
public class ObjectOuterAdapter implements IUserInfo {
    private IOuterUserBaseInfo iOuterUserBaseInfo;
    private IOuterUserHomeInfo iOuterUserHomeInfo;
    private IOuterUserOfficeInfo iOuterUserOfficeInfo;
    private Map userBaseInfo;
    private Map userHomeInfo;
    private Map userOfficeInfo;

    public ObjectOuterAdapter(IOuterUserBaseInfo iOuterUserBaseInfo, IOuterUserHomeInfo iOuterUserHomeInfo, IOuterUserOfficeInfo iOuterUserOfficeInfo) {
        this.iOuterUserBaseInfo = iOuterUserBaseInfo;
        this.iOuterUserHomeInfo = iOuterUserHomeInfo;
        this.iOuterUserOfficeInfo = iOuterUserOfficeInfo;
        userBaseInfo = iOuterUserBaseInfo.getUserBaseInfo();
        userHomeInfo = iOuterUserHomeInfo.getUserHomeInfo();
        userOfficeInfo = iOuterUserOfficeInfo.getUserOfficeInfo();
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
