package com.zingking.javadesignmode.observer;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/12/12
 * description：观察者：短信处理中心
 */
class MessageCenter implements IObserver {
    private static final String TAG = "MessageCenter";

    @Override
    public void update(Object data) {
        if (data instanceof AirTicket.TicketBean) {
            sendMessageToUser((AirTicket.TicketBean) data);
        } else {
            System.out.println(TAG + " - MessageCenter.update -> 数据类型无法处理，丢弃！ ");
        }
    }

    private void sendMessageToUser(AirTicket.TicketBean ticketBean) {
        System.out.println(TAG + " - MessageCenter.sendMessageToUser -> 尊敬的用户，您的购票信息如下：\n 航班号:"
                + ticketBean.flightNum + "\n 日期:" + ticketBean.date + "\n 票务状态:" + ticketBean.state);
    }

}
