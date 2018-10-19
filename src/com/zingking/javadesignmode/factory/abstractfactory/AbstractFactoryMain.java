package com.zingking.javadesignmode.factory.abstractfactory;

import com.zingking.javadesignmode.factory.abstractfactory.factory.HUAWEIFactory;
import com.zingking.javadesignmode.factory.abstractfactory.factory.IFactory;
import com.zingking.javadesignmode.factory.abstractfactory.product.cpu.ICpu;
import com.zingking.javadesignmode.factory.abstractfactory.product.npu.INpu;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/19
 * description：<p>抽象(产品角色)工厂模式</p>
 * <p>增加了产品族和产品等级的概念。产品族表示同一系列，例如华为、小米。产品等级表示同一类型，例如cpu、npu</p>
 * <p>水果的例子不好扩展及理解，换成手机的例子</p>
 * <p>假设手机只有CPU组成，那就是工厂方法模式，一个工厂创建一种cpu，华为生产华为cpu，小米生产小米cpu</p>
 * <p>现在手机有多了npu，如果还是工厂方法模式，就需要华为cpu工厂，华为npu工厂，小米cpu工厂，小米npu工厂,显示中并不是，
 * 华为工厂生产华为cpu华为npu，小米工厂生产小米cpu小米npu，这就是抽象工厂</p>
 * <p>关于开-闭原则:增加产品族，支持该原则。例如增加魅族手机，只需要增加魅族工厂和魅族cpu魅族npu，不需要动华为和小米。
 * 增加产品等级，不支持该原则。例如手机需要增加屏幕，那就需要改手机标准，增加屏幕接口，增加华为屏幕，增加小米屏幕，同时
 * 还要修改华为和小米工厂，工厂需要购买屏幕设备。</p>
 */
public class AbstractFactoryMain {
    public static void main(String[] args){
        IFactory factory = new HUAWEIFactory();
        ICpu cpu = factory.createCpu();
        cpu.core();
        cpu.framework();
        INpu npu = factory.createNpu();
        npu.size();
        npu.version();
    }

}
