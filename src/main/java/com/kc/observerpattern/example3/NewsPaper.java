package com.kc.observerpattern.example3;


import java.util.Observable;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class NewsPaper extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        super.notifyObservers(content);
    }
}
