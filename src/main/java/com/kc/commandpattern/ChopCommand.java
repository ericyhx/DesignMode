package com.kc.commandpattern;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class ChopCommand implements Command {
    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi=null;
    /**
     * 点菜的桌号
     */
    private int tableNum;

    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    public CookApi getCookApi() {
        return cookApi;
    }

    @Override
    public void execute() {
       this.cookApi.cook(tableNum,"绿豆排骨煲");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi=cookApi;
    }

    @Override
    public int getTableNum() {
        return this.tableNum;
    }
}
