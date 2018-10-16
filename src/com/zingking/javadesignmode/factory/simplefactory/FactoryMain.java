package com.zingking.javadesignmode.factory.simplefactory;

import com.zingking.javadesignmode.factory.simplefactory.factory.FruitFactory;
import com.zingking.javadesignmode.factory.simplefactory.product.FruitNewApple;
import com.zingking.javadesignmode.factory.simplefactory.product.IFruit;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/16
 * description：
 * <p>优点：解耦，客户端只需要和工厂类交互，不在关注对象实例怎么被创建出来；当实例发生变化时，只需要改工厂类而不需要改客户端；
 * 还可以从给外部提供sdk的角度考虑优点</p>
 * <p>例如：第一个版本是红富士苹果，后面发现这个苹果有问题是个烂苹果，需要换新苹果{@link FruitNewApple},这时就可以直接在工厂类直接修改，
 * 如果没有使用工厂方法则需要在每个创建苹果的地方都要改。当然也可以直接修正之前的烂苹果</p>
 * <p>适用场景：
 * <p>1.构建一个对象实例需要初始化很多参数，例如数据库的链接，可以通过工厂模式减少代码重复</p>
 * <p>2.有很多子类，这些子类的对象实例在创建过程中容易发生改变，或者对子类的调用容易改变？？？
 * <p>https://blog.csdn.net/kocscs123/article/details/53243847</p></p></p>
 * <p>缺点：增加新的产品需要修改工厂类，工厂类必须知道所有可生产出的产品，不符合开-闭原则</p>
 */
class FactoryMain {
    public static void main(String[] args) {
        IFruit fruit = FruitFactory.createFruit("apple");
        if (fruit != null) {
            fruit.grow();
            fruit.ripe();
            fruit.fade();
        }
    }
}
