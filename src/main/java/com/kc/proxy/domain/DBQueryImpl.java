package com.kc.proxy.domain;

/**
 * @Description:真是主题
 * @author: yuhongxi
 * @date:2019/9/19
 */
public class DBQueryImpl implements DBQuery {
    public DBQueryImpl() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("真实主题初始化完成");
    }

    @Override
    public String request() {
        return "query db data result";
    }
}
