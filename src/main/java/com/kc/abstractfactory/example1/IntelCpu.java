package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class IntelCpu implements CpuApi {
    private int pins=0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("intel cpu test,pins="+pins);
    }
}
