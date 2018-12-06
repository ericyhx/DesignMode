package com.kc.facadepattern;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Client {
    public static void main(String[] args) {
        final FacadeApi facadeApi = FacadeFactory.createFacadeApi();
        facadeApi.generator();
    }
}
