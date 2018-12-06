package com.kc.abstractfactory;


import com.kc.abstractfactory.example2.AbstractFactory;
import com.kc.abstractfactory.example2.ComputerEnginner;
import com.kc.abstractfactory.example2.Schema1;
import com.kc.abstractfactory.example2.Schema2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Client {
    public static void main(String[] args) {
        ComputerEnginner enginner=new ComputerEnginner();
        AbstractFactory factory=new Schema1();
        enginner.makeComputer(factory);
    }
}
