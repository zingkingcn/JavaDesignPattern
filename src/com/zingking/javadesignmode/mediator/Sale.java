package com.zingking.javadesignmode.mediator;

import java.util.Random;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 销售类，销售得好库存减少快，进货要增加
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 销售电脑
     * @param number 销售数量
     */
    public void sellIbmComputer(int number){
        abstractMediator.sellComputer(number);
    }

    public int getSaleState(){
        Random random = new Random(System.nanoTime());
        return random.nextInt(100);
    }

    public void offSale(){
        abstractMediator.offSale();
    }

}
