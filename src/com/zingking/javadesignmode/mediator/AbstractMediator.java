package com.zingking.javadesignmode.mediator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 抽象的中介者，持有所有同事类实例
 */
public abstract class AbstractMediator {
    // 依赖的赋值采用setter和getter是因为中介者可以有部分同事类
    private Purchase purchase;
    private Stock stock;
    private Sale sale;
    public AbstractMediator() {

    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    /**
     * 购买电脑
     * @param number 购买数量
     */
    public abstract void buyComputer(int number);

    /**
     * 销售电脑
     * @param number 销售数量
     */
    public abstract void sellComputer(int number);

    /**
     * 清理库存
     */
    public abstract void clearStock();

    /**
     * 折价销售
     */
    public abstract void offSale();

}
