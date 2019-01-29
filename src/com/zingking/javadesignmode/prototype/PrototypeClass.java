package com.zingking.javadesignmode.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import sun.security.jca.ServiceId;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2019/1/29
 * Describe: 支持clone的类，一个矩形
 */
public class PrototypeClass implements Cloneable, Serializable {


    private static final String TAG = "PrototypeClass";
    private int width;
    private Integer height;
    private String desc;
    private int[] rect = new int[4];// 两个点，矩形的左上点坐标和右下点坐标
    private ArrayList<String> lists;

    public PrototypeClass() {
        System.out.println(TAG + "构造方法执行");
        lists = new ArrayList<>();
    }

    public PrototypeClass(int width, Integer height, int[] rect, String desc) {
        System.out.println(TAG + "构造方法执行");
        this.width = width;
        this.height = height;
        this.rect = rect;
        this.desc = desc;
        lists = new ArrayList<>();
    }


    public void setListValue(String s) {
        lists.add(s);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getRect() {
        return rect;
    }

    public void setRect(int[] rect) {
        this.rect = rect;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getLists() {
        return lists;
    }

    @Override
    protected Object clone() {
        Object result = null;
        try {
            result = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected Object deepClone() {
        PrototypeClass result = null;
        try {
            result = (PrototypeClass) super.clone();
            result.lists = (ArrayList<String>) lists.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected Object deepCloneByByteArray() {
        Object result = null;
        try {
            // 把对象写到流里
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            // 从流里读出来
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            result = objectInputStream.readObject();
            // TODO: 2019/1/29 为什么这里的流不需要关闭？ by Z.kai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString() {
        return "PrototypeClass{" +
                "width=" + width +
                ", height=" + height +
                ", desc='" + desc + '\'' +
                ", rect=" + Arrays.toString(rect) +
                ", lists=" + lists +
                '}' +
                " @" + Integer.toHexString(hashCode());
    }

}
