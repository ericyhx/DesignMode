package com.kc.commandpattern;

/**
 * @Description: 服务员，负责组合菜单，还负责执行调用
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class Waiter {
    /**
     * 持有一个宏命令对象---菜单
     */
    private MenuCommand menu=new MenuCommand();
    public void orderDish(Command cmd){
        menu.addCmd(cmd);
    }
    public void  orderOver(){
        menu.execute();
    }
}
