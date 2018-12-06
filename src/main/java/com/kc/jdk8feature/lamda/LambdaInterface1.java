package com.kc.jdk8feature.lamda;

import java.util.Arrays;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public interface LambdaInterface1 {
//    void test(String s,String s2);
    void test(String s);
}
interface LambdaInterface2{
    void test(int[] arrs);
}
interface LambdaInterface3{
    /**
     * 构造器引用
     * @param ss
     * @return
     */
    String test(char[] ss);
}
class LambdTest2{
    public static void main(String[] args) {
//        LambdaInterface1 i1=(s1,s2)-> System.out.println(s1+"--->"+s2);
//        i1.test("一个参数的测试",".....");
        /**
         * System.out是一个实例
         */
        LambdaInterface1 i2=System.out::println;
        i2.test("实例方法的引用");
        LambdaInterface2 i3=Arrays::sort;
        int[] a = {3, 5, 7, 3, 1, 8};
        i3.test(a);
        i2.test(Arrays.toString(a));
        System.out.println("=====================");
        /**
         * 构造器引用
         */
        LambdaInterface3 i4=String::new;
        final String test = i4.test(new char[]{'你', '是', '谁'});
        System.out.println(test);
    }
}