package com.kc.commandpattern.msb;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class ShoppingCommand extends Command {
    @Override
    public void execute() {
        System.out.println("go to shopping at zoo....");
    }

    @Override
    public void unDo() {
        System.out.println("undo...zoo");
    }
}
