package com.kc.observerpattern.example1;

/**
 * @Description:具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一直
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class ConcretObserver implements Observer {
    private String observerState;
    @Override
    public void update(Subject subject) {
        observerState=((ConcretSubject)subject).getSubjectState();
    }
}
