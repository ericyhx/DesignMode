package com.kc.abstractfactory.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Schema3 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        if(type==1){
            return new IntelCpu(1156);
        }else if (type==2){
            return new HpMainboard(1156);
        }else {
            return new HyMemony();
        }
    }
}
