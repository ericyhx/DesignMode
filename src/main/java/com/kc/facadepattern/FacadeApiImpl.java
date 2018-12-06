package com.kc.facadepattern;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class FacadeApiImpl implements FacadeApi {
    @Override
    public void generator() {
        Dao.generator();
        Service.generator();
        Controller.generator();
    }
}
