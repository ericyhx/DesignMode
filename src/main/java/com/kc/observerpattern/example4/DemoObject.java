package com.kc.observerpattern.example4;

import java.util.EventObject;

/**
 * @Description:事件对象
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class DemoObject extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DemoObject(Object source) {
        super(source);
    }
    public void doEvent(){
        System.out.println("通知一个事件源 source："+this.getSource());
    }
}
