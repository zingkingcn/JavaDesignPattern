package com.zingking.javadesignmode.adapter;

import com.zingking.javadesignmode.adapter.classadapter.ClassOuterAdapter;
import com.zingking.javadesignmode.adapter.classadapter.OuterUser;
import com.zingking.javadesignmode.adapter.objectadapter.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/31
 * Describe: 场景测试类
 */
public class AdapterMain {

    public static void main(String[] args) {
        List<IUserInfo> dataFromDatabase = getDataFromDatabase2();
        dataFromDatabase.add(new UserInfo());
        for (IUserInfo iUserInfo : dataFromDatabase) {
            System.out.println("==== iUserInfo.toString() ====> " + iUserInfo.getUserName());
        }
    }

    /**
     * 测试类适配器
     */
    private static List<IUserInfo> getDataFromDatabase() {
        List<IUserInfo> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            IUserInfo outerUser = new ClassOuterAdapter();
            result.add(outerUser);
        }
        return result;
    }

    /**
     * 测试对象适配器
     */
    private static List<IUserInfo> getDataFromDatabase2() {
        List<IUserInfo> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            IOuterUserBaseInfo outerUserBaseInfo = new OuterUserBaseInfo();
            IOuterUserHomeInfo outerUserHomeInfo = new OuterUserHomeInfo();
            IOuterUserOfficeInfo outerUserOfficeInfo = new OuterUserOfficeInfo();
            IUserInfo outerUser = new ObjectOuterAdapter(outerUserBaseInfo, outerUserHomeInfo, outerUserOfficeInfo);
            result.add(outerUser);
        }
        return result;
    }
}
