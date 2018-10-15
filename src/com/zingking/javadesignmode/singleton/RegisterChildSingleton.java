package com.zingking.javadesignmode.singleton;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/15
 * description：
 */
class RegisterChildSingleton extends RegisterSingleton {

    public RegisterChildSingleton(){

    }

    @Override
    public void printSomething(){
        System.out.println("我是登记式单例的子类");
    }

}
