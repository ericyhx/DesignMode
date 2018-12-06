package com.kc.observerpattern.example4;

import java.util.EventObject;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Client {
    public static void main(String[] args) {
        EventSource source=new EventSource();
//        source.addListener(new DemoListener() {
//            @Override
//            public void handleEvent(EventObject event) {
//                ((DemoObject)event).doEvent();
//                System.out.println("getsource:"+event.getSource());
//            }
//        });
//        source.notifyListenerEvents(new DemoObject("openWin10"));
        source.onCloseWindows(new DemoListener() {
            @Override
            public void handleEvent(EventObject event) {
                System.out.println(event.getSource());
            }
        });
        source.doCloseWindows();
    }
}
