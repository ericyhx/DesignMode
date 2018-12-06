package com.kc.jdk8feature.functionInterface;

/**
 * @Description:使用@FunctionInterface注解的方法，有且只有一个抽象方法
 * @author: yuhongxi
 * @date:2018/10/27
 */

/**
 * 函数式接口
 */
@FunctionalInterface
public interface FunctionInterface3 {
    void test();
    static void test1(){};
}
