package com.zingking.javadesignmode.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/2/19
 * description：享元工厂类
 */
public class FlyWeightFactory {
    private static FlyWeightFactory flyWeightFactory;
    private static final Map<String, IShape> rectangleMap = new HashMap<>();

    private FlyWeightFactory() {
    }

    public static FlyWeightFactory getInstance() {
        if (flyWeightFactory == null) {
            synchronized (FlyWeightFactory.class) {
                if (flyWeightFactory == null) {
                    flyWeightFactory = new FlyWeightFactory();
                }
            }
        }
        return flyWeightFactory;
    }

    public IShape getRectangle(String color) {
        IShape iShape = rectangleMap.get(color);
        if (iShape == null) {
            iShape = new Rectangle(color);
            rectangleMap.put(color, iShape);
            System.out.println("create rectangle,color = " + color);
        }
        return iShape;
    }
}
