package com.zingking.javadesignmode.mediator;


/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 具体中介者，协调各同事类行为
 */
public class Mediator extends AbstractMediator {
    private static final String TAG = "Mediator";

    @Override
    public void buyComputer(int number) {
        // 购买电脑数量需要根据销售情况确认
        int saleState = getSale().getSaleState();
        // 销售良好，正常采购
        if (saleState > 80) {
            System.out.println(TAG + ": 购入" + number + "台。");
            getStock().increase(number);
        }
        // 销售不好，折半采购
        else {
            System.out.println(TAG + ": 购入" + number / 2 + "台。");
            getStock().increase(number / 2);
        }
    }

    @Override
    public void sellComputer(int number) {
        System.out.println(TAG + ": 销售" + number + "台。");
        // 销售电脑需要判断库存是否充足
        if (getStock().getStockNumber() < number) {
            getPurchase().buyIbmComputer(number);
        }
        getStock().decrease(number);
    }

    @Override
    public void clearStock() {
        System.out.println(TAG + ": 清仓处理。");
        getSale().offSale();
        getPurchase().refuseBuyIbm();
    }

    @Override
    public void offSale() {
        System.out.println(TAG + ": 折价销售。");
        getStock().decrease(getStock().getStockNumber());
    }
}
