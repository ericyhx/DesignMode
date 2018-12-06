package com.kc.observerpattern.example4;

import java.util.EventObject;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Listener implements DemoListener {
    @Override
    public void handleEvent(EventObject event) {
        ((DemoObject)event).doEvent();
    }
}
