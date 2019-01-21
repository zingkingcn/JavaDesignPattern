package com.zingking.javadesignmode.mediator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe:
 */
public class MediatorMain {
    public static void main(String[] args){
        Mediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        Sale sale = new Sale(mediator);
        Stock stock = new Stock(mediator);

        mediator.setPurchase(purchase);
        mediator.setSale(sale);
        mediator.setStock(stock);

        purchase.buyIbmComputer(100);
        sale.sellIbmComputer(20);
        stock.clearStock();
    }
}
