package com.zingking.javadesignmode.mediator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 库存类，库存影响进货数量及是否打折销售
 */
public class Stock extends AbstractColleague {
    private static final String TAG = "Stock";
    private int ibmNum = 100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 库存增加
     *
     * @param number 增加数量
     */
    public void increase(int number) {
        ibmNum += number;
        System.out.println(TAG + ": increase number ====> " + number);
    }

    /**
     * 库存减少
     *
     * @param number 减少数量
     */
    public void decrease(int number) {
        if (number > ibmNum) {
            number = ibmNum;
        }
        ibmNum -= number;
        System.out.println(TAG + ": decrease number ====> " + number);
    }

    /**
     * 获取库存数量
     *
     * @return 库存数量
     */
    public int getStockNumber() {
        return ibmNum;
    }

    // 库存过剩，通知采购不要再采购，销售尽快销售
    public void clearStock() {
        abstractMediator.clearStock();
    }

}
