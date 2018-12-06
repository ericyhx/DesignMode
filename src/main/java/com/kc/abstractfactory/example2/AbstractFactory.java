package com.kc.abstractfactory.example2;

/**
 * @Description:可扩展的抽象工厂
 * @author: yuhongxi
 * @date:2018/10/2
 */
public interface AbstractFactory {
    public Object createProduct(int type);
}
