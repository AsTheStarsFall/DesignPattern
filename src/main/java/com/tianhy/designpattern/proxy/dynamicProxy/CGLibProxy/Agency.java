package com.tianhy.designpattern.proxy.dynamicProxy.CGLibProxy;


import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/25
 **/
public class Agency implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        //设置被代理的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private void after() {
        System.out.println("before");
    }

    private void before() {
        System.out.println("after");
    }
}
