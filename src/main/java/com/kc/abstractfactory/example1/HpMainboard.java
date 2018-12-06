package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class HpMainboard implements MainboardApi {
    private int holes=0;

    public HpMainboard(int holes) {
        this.holes = holes;
    }

    @Override
    public void installCPU() {
        System.out.println("hp mainboard test install,holes="+holes);
    }
}
