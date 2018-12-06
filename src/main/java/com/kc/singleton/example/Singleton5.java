package com.kc.singleton.example;

/**
 * @Description:基于枚举现实线程安全的单例模式
 * @author: yuhongxi
 * @date:2018/10/2
 */
public enum  Singleton5 {
    uniqueInstance;
    private String field="";
    public void method(){
        System.out.println("枚举实现线程安全单例");
    }
}
