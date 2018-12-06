package com.kc.factorymethod.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class ExportXmlFile extends ExportOperator {
    @Override
    protected FileExportApi factoryMethod() {
        return new XmlFile();
    }
}
