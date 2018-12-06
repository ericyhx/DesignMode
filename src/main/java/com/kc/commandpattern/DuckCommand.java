package com.kc.commandpattern;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class DuckCommand implements Command {
    private CookApi cookApi=null;
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum,"北京烤鸭");
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
