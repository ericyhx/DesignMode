package com.kc.singleton.example;

/**
 * @Description:私有内部类实现线程安全的单例模式
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Singleton4 {
    private static class SingletonHeader{
        public static Singleton4 instance=new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return SingletonHeader.instance;
    }
}
