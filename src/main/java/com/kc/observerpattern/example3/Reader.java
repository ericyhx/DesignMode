package com.kc.observerpattern.example3;


import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Reader implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("改变的内容是："+arg);
        System.out.println("拉模型："+((NewsPaper)o).getContent());

    }
}
