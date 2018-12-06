package com.kc.factorymethod.example1;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class XmlFile implements FileExportApi {
    @Override
    public boolean export(String data) {
        System.out.println("到处到xml文件");
        return true;
    }
}
