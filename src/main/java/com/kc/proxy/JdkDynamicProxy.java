package com.kc.proxy;

import com.kc.proxy.domain.DBQuery;
import com.kc.proxy.domain.DBQueryImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2019/9/19
 */
public class JdkDynamicProxy {
    public static void main(String[] args) {
        DBQueryImpl target=new DBQueryImpl();
        DBQuery query = (DBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), target.getClass().getInterfaces(), (proxy, method, args1) -> method.invoke(target, args1));

        System.out.println(query.request());
    }
}
