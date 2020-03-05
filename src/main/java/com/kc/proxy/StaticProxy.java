package com.kc.proxy;

import com.kc.proxy.domain.DBQuery;
import com.kc.proxy.domain.DBQueryImpl;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2019/9/19
 */
public class StaticProxy implements DBQuery {
    private DBQuery query=null;
    @Override
    public String request() {
        if(query==null){
            System.out.println("jdk proxy init real topic");
            query=new DBQueryImpl();
        }
        return query.request();
    }

    public static void main(String[] args) {
        DBQuery query=new StaticProxy();
        System.out.println(query.request());
    }
}
