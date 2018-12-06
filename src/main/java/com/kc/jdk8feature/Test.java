package com.kc.jdk8feature;

import com.kc.jdk8feature.interfaces.InterfaceTest;
import com.kc.jdk8feature.interfaces.InterfaceTest2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class Test {
    public static void main(String[] args) {
        final String value = InterfaceTest2.value;
        System.out.println(value);
        InterfaceTest test=new InterfaceTest() {
        };
        test.test1();
    }
}
