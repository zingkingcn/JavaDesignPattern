package com.zingking.javadesignmode.mediator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/21
 * Describe: 进货类
 */
public class Purchase extends AbstractColleague {
    private static final String TAG = "Purchase";
    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    // 依赖方法 dep-method，购买电脑需要根据销量和库存情况来决定是否买电脑买多少台等
    public void buyIbmComputer(int number){
        abstractMediator.buyComputer(number);
    }

    // 自有方法 sel-method
    public void refuseBuyIbm(){
        System.out.println(TAG + " 不再采购IBM电脑。");
    }

}
