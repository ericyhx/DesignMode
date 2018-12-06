package com.kc.singleton.example;

/**
 * @Description:饿汉模式
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Singleton1 {
    private Singleton1(){}
    public static Singleton1 instance=new Singleton1();
}
