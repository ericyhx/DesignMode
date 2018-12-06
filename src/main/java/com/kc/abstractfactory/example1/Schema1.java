package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CpuApi createCpuApi() {
        return new IntelCpu(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard(1156);
    }
}
