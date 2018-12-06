package com.kc.abstractfactory.example1;

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
        this.cpu=shema.createCpuApi();
        this.mainboard=shema.createMainboardApi();
        cpu.calculate();
        mainboard.installCPU();
    }
}
