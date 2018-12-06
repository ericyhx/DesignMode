package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class AMDcpu implements CpuApi {
    private int pins=0;

    public AMDcpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("amc cpu test,pins="+pins);
    }
}
