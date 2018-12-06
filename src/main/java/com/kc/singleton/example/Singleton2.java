package com.kc.singleton.example;

/**
 * @Description:懒汉模式(线程非安全)
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Singleton2 {
    private Singleton2(){}
    public static Singleton2 instance=null;
    public static Singleton2 getInstance(){
        if(instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
