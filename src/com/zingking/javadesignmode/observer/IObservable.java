package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/12
 * description：被观察者接口
 */
interface IObservable {

    void addObserver(IObserver iObserver);

    void removeObserver(IObserver iObserver);

    /**
     * 携带数据通知观察者
     * @param data 需要处理的数据
     */
    void notifyObserver(Object data);

}
