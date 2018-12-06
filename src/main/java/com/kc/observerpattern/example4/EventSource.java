package com.kc.observerpattern.example4;

import java.util.EventObject;
import java.util.Vector;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class EventSource {
    /**监听器列表，监听器的注册则加入此列表**/
    private Vector<DemoListener> listeners=new Vector<>();
    public void addListener(DemoListener listener){
        listeners.add(listener);
    }
    public void removeListener(DemoListener listener){
        listeners.remove(listener);
    }
    public void notifyListenerEvents(EventObject object){
        for(DemoListener listener:listeners){
            listener.handleEvent(object);
        }
    }
    public void onCloseWindows(DemoListener listener){
        System.out.println("关注窗口关闭事件");
        listeners.add(listener);
    }
    public void doCloseWindows(){
        this.notifyListenerEvents(new EventObject("closeWindows"));
    }
}
