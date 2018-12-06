package com.kc.adapterpattern.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Target target=new Adapter(adaptee);
        target.request();
    }
}
