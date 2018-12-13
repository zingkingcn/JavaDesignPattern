package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/12
 * description：观察者接口，接受被观察者传递的数据
 */
interface IObserver {

    void update(Object data);
}
