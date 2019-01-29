package com.zingking.javadesignmode.prototype;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/29
 * Describe: 场景类
 */
public class PrototypeMain {
    public static void main(String[] args) {
//        long l = testNewObject();
//        long cloneTime = testCloneObject();
//        System.out.println("==== new 1000 个对象耗时：" + l);
//        System.out.println("==== clone 1000 个对象耗时：" + cloneTime);

//        testClone();
        testDeepClone();
    }

    /**
     * 测试浅克隆
     */
    private static void testClone() {
        PrototypeClass prototypeClass = new PrototypeClass(300, 400,
                new int[]{500, 600, 700, 800}, "矩形");
        prototypeClass.setListValue("原对象");
        Object clone = prototypeClass.clone();
        if (clone instanceof PrototypeClass) {
            ((PrototypeClass) clone).setHeight(0);
            ((PrototypeClass) clone).setRect(null);
            ((PrototypeClass) clone).setDesc("克隆的矩形");
            ((PrototypeClass) clone).setListValue("克隆的对象");
        }
        System.out.println("==== prototypeClass.toString() ====> " + prototypeClass.toString());
        System.out.println("==== clone.toString() ====> " + clone.toString());
    }

    /**
     * 测试深克隆
     */
    private static void testDeepClone(){
        PrototypeClass prototypeClass = new PrototypeClass(300, 400,
                new int[]{500, 600, 700, 800}, "矩形");
        prototypeClass.setListValue("原对象");
        Object clone = prototypeClass.deepCloneByByteArray();
        if (clone instanceof PrototypeClass) {
            ((PrototypeClass) clone).setHeight(0);
            ((PrototypeClass) clone).setRect(null);
            ((PrototypeClass) clone).setDesc("克隆的矩形");
            ((PrototypeClass) clone).setListValue("克隆的对象");
        }
        System.out.println("==== prototypeClass.toString() ====> " + prototypeClass.toString());
        System.out.println("==== clone.toString() ====> " + clone.toString());
    }

    /**
     * 测试new 1000个对象
     *
     * @return new 1000对象耗时
     */
    private static long testNewObject() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            PrototypeClass prototypeClass = new PrototypeClass(i, i + 1,
                    new int[]{i, i + 1, i + 2, i + 3}, "矩形");
            System.out.println(prototypeClass.toString());
        }
        long end = System.nanoTime();
        return end - start;
    }

    /**
     * 测试 clone 1000个对象
     *
     * @return clone 1000对象耗时
     */
    private static long testCloneObject() {
        long start = System.nanoTime();
        PrototypeClass prototypeClass = new PrototypeClass(300, 400,
                new int[]{500, 600, 700, 800}, "矩形");
        for (int i = 0; i < 1000; i++) {
            Object clone = prototypeClass.clone();
            System.out.println(clone.toString());
        }
        long end = System.nanoTime();
        return end - start;
    }

}
