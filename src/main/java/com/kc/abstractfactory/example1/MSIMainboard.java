package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class MSIMainboard implements MainboardApi {
    private int holes=0;

    public MSIMainboard(int holes) {
        this.holes = holes;
    }

    @Override
    public void installCPU() {
        System.out.println("msi mainboard test install cpu,holes="+holes);
    }
}
