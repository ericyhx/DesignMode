package com.kc.observerpattern.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:目标对象，它知道观察他的所有观察者，并提供注册和删除观察者的接口
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Subject {
    /**
     * 用来保存注册的观察者
     */
    private List<Observer> observers=new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    protected void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
