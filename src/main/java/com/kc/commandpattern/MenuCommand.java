package com.kc.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:菜单对象，是个宏命令对象
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class MenuCommand implements Command{
    private List<Command> col=new ArrayList<>();

    public List<Command> getCmds() {
        return col;
    }
    public void addCmd(Command cmd){
        col.add(cmd);
    }

    public List<Command> getCol() {
        return col;
    }

    @Override
    public void execute() {
        //执行菜单，就是把菜单传给后厨
        CommandQueue.addMenu(this);
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        //什么都不用做
    }

    @Override
    public int getTableNum() {
        //什么都不用做
        return 0;
    }
}
