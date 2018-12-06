package com.kc.abstractfactory.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class ComputerEnginner {
    private CpuApi cpu;
    private MainboardApi mainboard;

    public void makeComputer(AbstractFactory shema){
        prepareHardwares(shema);
    }

    private void prepareHardwares(AbstractFactory shema) {
        this.cpu= (CpuApi) shema.createProduct(1);
        this.mainboard= (MainboardApi) shema.createProduct(2);
        cpu.calculate();
        mainboard.installCPU();
    }
}
