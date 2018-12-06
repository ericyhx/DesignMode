package com.kc.jdk8feature.interfaces;

/**
 * @Description:
 *  增加了default方法和static方法，在接口中这两个方法可以有方法体
 *  default方法属于实例，static方法属于接口
 *  接口里面的静态方法不会被继承,但是静态变量可以被继承；
 *  子接口会覆盖夫接口里面的默认方法
 * @author: yuhongxi
 * @date:2018/10/27
 */
public interface InterfaceTest {
    static String value="static value";
    default void test1(){
        System.out.println("interface default method");
    }
    static void test2(){
        System.out.println("interface static method");
    }
}
