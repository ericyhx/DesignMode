package com.kc.factorymethod;

import com.kc.factorymethod.example1.ExportOperator;
import com.kc.factorymethod.example1.ExportXmlFile;
import com.kc.factorymethod.example1.FileExportApi;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Client {
    public static void main(String[] args) {
        ExportOperator operator=new ExportXmlFile();
        operator.exportFile("file data");
    }
}
