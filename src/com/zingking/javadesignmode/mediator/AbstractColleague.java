package com.zingking.javadesignmode.mediator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 抽象同事类，定义同事类的通用接口，一般很少有通用的接口
 */
public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
