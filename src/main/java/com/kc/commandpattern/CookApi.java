package com.kc.commandpattern;

/**
 * @Description:执行命令的对象
 * @author: yuhongxi
 * @date:2018/10/6
 */
public interface CookApi {
    /**
     * 示意做菜的方法
     * @param tableNum 桌号
     * @param name 菜名
     */
    void cook(int tableNum,String name);
}
