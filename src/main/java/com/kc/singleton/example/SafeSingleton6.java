package com.kc.singleton.example;

/**
 * @Description: 懒汉模式（线程安全）
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class SafeSingleton6 {
    private SafeSingleton6(){}
    public volatile static SafeSingleton6 instance=null;

    /**
     * 同步方法
     * @return
     */
    public static synchronized SafeSingleton6 getInstance(){
        if(instance==null){
            instance=new SafeSingleton6();
        }
        return instance;
    }

    /**
     * 同步块，二次判断加锁机制
     * @return
     */
    public static SafeSingleton6 getInstance2(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance=new SafeSingleton6();
                }
            }
        }
        return instance;
    }
}
