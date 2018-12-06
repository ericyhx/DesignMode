package com.kc.commandpattern;

import java.awt.*;

/**
 * @Description:后厨的管理类，通过此类让后厨的厨师进行运行状态
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class CookManager {
    private static boolean isRun=false;
    public static void runCookManager(){
        if(!isRun){
            isRun=true;
            HotCook cook1=new HotCook("张三");
            HotCook cook2=new HotCook("李四");
            HotCook cook3=new HotCook("王五");
            Thread t1=new Thread(cook1);
            Thread t2=new Thread(cook2);
            Thread t3=new Thread(cook3);
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
