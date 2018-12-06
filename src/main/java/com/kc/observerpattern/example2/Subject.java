package com.kc.observerpattern.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Subject {
    /**
     * 用来保存注册的观察者
     */
    private List<Observer> observers=new ArrayList<>();
    public void attach(Observer reader){
        observers.add(reader);
    }
    public void detach(Observer reader){
        observers.remove(reader);
    }
    protected void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
