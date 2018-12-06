package com.kc.observerpattern.example1;

/**
 * @Description:观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author: yuhongxi
 * @date:2018/10/6
 */
public interface Observer {
    /**
     * 传入目标对象，获取相应的目标对象的状态
     * @param subject
     */
    public void update(Subject subject);
}
