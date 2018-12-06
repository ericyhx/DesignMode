package com.kc.factorymethod.example1;

/**
 * @Description:抽象类：既要约束子类的行为，又要为子类提供公共方法
 * @author: yuhongxi
 * @date:2018/10/2
 */
public abstract class ExportOperator {
    protected abstract FileExportApi factoryMethod();
    public boolean exportFile(String data){
        FileExportApi api=factoryMethod();
        return api.export(data);
    }
}
