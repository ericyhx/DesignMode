package com.kc.adapterpattern.example1;

/**
 * @Description:适配器
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Adapter implements Target {
    /**
     * 持有被适配的接口对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
