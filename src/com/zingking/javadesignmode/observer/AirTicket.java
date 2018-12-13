package com.zingking.javadesignmode.observer;

import java.util.ArrayList;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/12
 * description：飞机片类，是被观察者，所以要实现IObservable接口
 */
class AirTicket implements ITicket, IObservable {
    private static final String TAG = "AirTicket";
    private ArrayList<IObserver> observerList;
    private TicketBean ticketBean;

    public AirTicket(String flightNum, String date) {
        ticketBean = new TicketBean(flightNum, date);
        observerList = new ArrayList<>();
    }

    @Override
    public void buySuccess() {
        ticketBean.state = "购票成功";
        System.out.println(TAG + " - AirTicket.buySuccess -> 购票成功");
        notifyObserver(ticketBean);
    }

    @Override
    public void buyFailed() {
        ticketBean.state = "购票失败";
        System.out.println(TAG + " - AirTicket.buySuccess -> 购票失败");
    }

    @Override
    public void addObserver(IObserver iObserver) {
        if (!observerList.contains(iObserver)) {
            observerList.add(iObserver);
        }
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void notifyObserver(Object data) {
        for (IObserver iObserver : observerList) {
            iObserver.update(data);
        }
    }

    class TicketBean {
        String flightNum;
        String date;
        String state = "NULL";

        TicketBean(String flightNum, String date) {
            this.flightNum = flightNum;
            this.date = date;
        }

        @Override
        public String toString() {
            return "TicketBean{" +
                    "flightNum='" + flightNum + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

}
