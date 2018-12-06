package com.kc.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:菜单的命令队列
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class CommandQueue {
    private static List<Command> cmds=new ArrayList<>();
    public static synchronized void addMenu(MenuCommand menu){
        //一个菜单包含很多命令对象
        for(Command cmd:menu.getCmds()){
            cmds.add(cmd);
        }
    }
    public static synchronized Command getCommand(){
        Command cmd=null;
        if(cmds.size()>0){
            cmd=cmds.remove(0);
        }
        return cmd;
    }
}
