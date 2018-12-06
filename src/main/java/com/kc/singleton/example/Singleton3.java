package com.kc.singleton.example;

/**
 * @Description: 懒汉模式（线程安全）
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Singleton3 {
    private Singleton3(){}
    public static Singleton3 instance=null;

    /**
     * 同步方法
     * @return
     */
    public static synchronized Singleton3 getInstance(){
        if(instance==null){
            instance=new Singleton3();
        }
        return instance;
    }

    /**
     * 同步块，二次判断加锁机制
     * @return
     */
    public static Singleton3 getInstance2(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
