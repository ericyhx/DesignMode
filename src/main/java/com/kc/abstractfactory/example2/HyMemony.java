package com.kc.abstractfactory.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class HyMemony implements MemonyApi {
    @Override
    public void cacheData() {
        System.out.println("现在所占有的内存");
    }
}
