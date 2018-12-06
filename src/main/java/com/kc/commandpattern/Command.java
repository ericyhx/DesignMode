package com.kc.commandpattern;

/**
 * @Description:命令
 * @author: yuhongxi
 * @date:2018/10/6
 */
public interface Command {
    /**
     * 执行命令对应的操作
     */
    public void  execute();

    /**
     * 设置命令的接收者
     * @param cookApi
     */
    public void setCookApi(CookApi cookApi);

    /**
     * 返回发起请求的桌号，就是点菜的桌号
     * @return
     */
    public int getTableNum();
}
