package com.kc.commandpattern.msb;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class Boy {
    private String name;
    private List<Command> cmds=new ArrayList<>();

    public List<Command> getCmds() {
        return cmds;
    }

    public void setCmds(List<Command> cmds) {
        this.cmds = cmds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void pursue(MM mm){
    }
    public void  doSomeThing(){

    }

    public void executeCommonds() {
        for(Command c:cmds){
            c.execute();
        }
    }
    public void undoCommand(){

    }
}
