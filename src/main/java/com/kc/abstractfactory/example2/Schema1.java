package com.kc.abstractfactory.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Schema1 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        if(type==1){
            return new IntelCpu(1156);
        }else {
            return new HpMainboard(1156);
        }
    }
}
