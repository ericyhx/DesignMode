package com.kc.jdk8feature.lamda;

/**
 * @Description 使用Lambda表达式的时候，接口必须是函数式接口
 * @author: yuhongxi
 * @date:2018/10/27
 */
public interface LambdaInterface {
    void test();
}

  class TestLambda{
      public static void main(String[] args) {
          LambdaInterface l1=new LambdaInterface() {
              @Override
              public void test() {
                  System.out.println("normal test1....");
              }
          };
          l1.test();
          LambdaInterface l2=()-> System.out.println("Lambda test2....");
          l2.test();
      }
  }