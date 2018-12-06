package com.kc.commandpattern;

/**
 * @Description:命令模式队列请求
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Client {
    public static void main(String[] args) {
        CookManager .runCookManager();
        for (int i = 0; i < 5; i++) {
            Waiter waiter=new Waiter();
            ChopCommand chop=new ChopCommand(i);
            DuckCommand duck=new DuckCommand(i);
            waiter.orderDish(chop);
            waiter.orderDish(duck);
            waiter.orderOver();
        }
    }
}
