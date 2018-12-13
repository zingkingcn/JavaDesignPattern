package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/13
 * description：
 */
class DataCenter implements IObserver {
    private static final String TAG = "DataCenter";

    @Override
    public void update(Object data) {
        if (data instanceof AirTicket.TicketBean) {
            addToDatabase((AirTicket.TicketBean) data);
        }else {
            System.out.println(TAG + " - ActivityCenter.update -> 数据类型无法处理，丢弃！ ");
        }

    }

    private void addToDatabase(AirTicket.TicketBean ticketBean){
        if ("购票成功".endsWith(ticketBean.state)) {
            System.out.println(TAG + " - ActivityCenter.addNum -> 购买成功，记录到A数据库。");
        }else {
            System.out.println(TAG + " - ActivityCenter.addNum -> 购买失败，记录到B数据库。");
        }
    }
}
