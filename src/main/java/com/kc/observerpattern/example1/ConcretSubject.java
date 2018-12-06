package com.kc.observerpattern.example1;

/**
 * @Description:具体的目标对象，负责把有关状态存入到相应的观察者对象，并在自己状态发生改变时，通知各个观察者
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class ConcretSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
