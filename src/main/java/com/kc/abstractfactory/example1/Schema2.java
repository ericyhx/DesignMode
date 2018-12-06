package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CpuApi createCpuApi() {
        return new AMDcpu(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new HpMainboard(939);
    }
}
