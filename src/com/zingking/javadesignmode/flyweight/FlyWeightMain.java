package com.zingking.javadesignmode.flyweight;

import com.zingking.javadesignmode.flyweight.simple.FlyWeightFactory;
import com.zingking.javadesignmode.flyweight.simple.Rectangle;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/2/19
 * description：
 */
class FlyWeightMain {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Rectangle rectangle =
                    (Rectangle) FlyWeightFactory.getInstance().getRectangle(getRandomColor());
            rectangle.setX(getRandomX());
            rectangle.setY(getRandomY());
            rectangle.setWidth(100 + i);
            rectangle.setHeight(100 + i);
            rectangle.draw();
        }
    }


    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
