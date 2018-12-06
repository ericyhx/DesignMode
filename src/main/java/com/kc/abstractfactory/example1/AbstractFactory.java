package com.kc.abstractfactory.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public interface AbstractFactory {
    CpuApi createCpuApi();
    MainboardApi createMainboardApi();
}
