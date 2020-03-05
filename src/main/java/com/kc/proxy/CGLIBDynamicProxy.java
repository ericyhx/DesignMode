package com.kc.proxy;

import com.kc.proxy.domain.DBQuery;
import com.kc.proxy.domain.DBQueryImpl;
import com.kc.proxy.domain.Singer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2019/9/19
 */
public class CGLIBDynamicProxy implements MethodInterceptor {
    /**
     * 维护目标对象
     */
    private Object target;

    public CGLIBDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象创建要给代理对象
     * @return
     */
    public Object getProxyInstance(){
        //1、工具类
        Enhancer enhancer=new Enhancer();
        //2、设置父类
        enhancer.setSuperclass(target.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、创建子类（代理对象）
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("查询数据库之前做一些事情。。。。");
        Object result = method.invoke(target, args);
        System.out.println("查询到结果后再做一些事情");
        return result+"|it is ok?";
    }

    public static void main(String[] args) {
        Singer target=new Singer();
        CGLIBDynamicProxy proxy=new CGLIBDynamicProxy(target);
        Singer query = (Singer) proxy.getProxyInstance();
       query.sing();
    }
}
