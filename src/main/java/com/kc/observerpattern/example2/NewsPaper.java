package com.kc.observerpattern.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class NewsPaper extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        super.notifyObservers();
    }
}
