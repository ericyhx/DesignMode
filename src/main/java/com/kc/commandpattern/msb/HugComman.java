package com.kc.commandpattern.msb;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class HugComman extends Command {
    @Override
    public void execute() {
        System.out.println("hug");
    }

    @Override
    public void unDo() {
        System.out.println("open your arm");
    }
}
