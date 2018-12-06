package com.kc.facadepattern;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class FacadeFactory {
    private FacadeFactory(){}
    public static FacadeApi createFacadeApi(){
        return new FacadeApiImpl();
    }
}
