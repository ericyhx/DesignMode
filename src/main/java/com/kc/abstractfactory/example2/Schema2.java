package com.kc.abstractfactory.example2;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Schema2 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        if(type==1){
            return  new AMDcpu(939);
        }else {
            return new HpMainboard(939);
        }
    }
}
