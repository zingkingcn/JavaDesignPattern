package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/13
 * description：
 */
class ActivityCenter implements IObserver {
    private static final String TAG = "ActivityCenter";

    @Override
    public void update(Object data) {
        if (data instanceof AirTicket.TicketBean) {
            addNum((AirTicket.TicketBean) data);
        }else {
            System.out.println(TAG + " - ActivityCenter.update -> 数据类型无法处理，丢弃！ ");
        }
    }

    private void addNum(AirTicket.TicketBean ticketBean){
        if ("购票成功".endsWith(ticketBean.state)) {
            System.out.println(TAG + " - ActivityCenter.addNum -> 购买成功，赠送积分：500。");
        } else {
            System.out.println(TAG + " - ActivityCenter.addNum -> 购买失败，未赠送积分。");
        }
    }
}
