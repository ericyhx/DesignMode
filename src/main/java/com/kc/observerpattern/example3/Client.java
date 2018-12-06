package com.kc.observerpattern.example3;


/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Client {
    public static void main(String[] args) {
        NewsPaper paper=new NewsPaper();
        Reader reader=new Reader();
        reader.setName("张三");
        Reader reader2=new Reader();
        reader2.setName("李四");
        Reader reader3=new Reader();
        reader3.setName("王五");
        paper.addObserver(reader);
        paper.addObserver(reader2);
        paper.addObserver(reader3);

        paper.setContent("本期的报纸内容是");
    }
}
