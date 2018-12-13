package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/13
 * description：
 */
class Main {
    public static void main(String[] args){
        MessageCenter messageCenter = new MessageCenter();
        ActivityCenter activityCenter = new ActivityCenter();
        DataCenter dataCenter = new DataCenter();
        AirTicket airTicket = new AirTicket("川航 3U8884", "2019-02-28");
        airTicket.addObserver(messageCenter);
        airTicket.addObserver(activityCenter);
        airTicket.addObserver(dataCenter);

        airTicket.buyFailed();
        airTicket.buySuccess();
    }
}
