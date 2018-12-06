package com.kc.commandpattern.msb;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class MM {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void order(Boy boy){
            Command cmd=new ShoppingCommand();
            boy.getCmds().add(cmd);
            cmd=new HugComman();
            boy.getCmds().add(cmd);
            boy.executeCommonds();
    }
}
