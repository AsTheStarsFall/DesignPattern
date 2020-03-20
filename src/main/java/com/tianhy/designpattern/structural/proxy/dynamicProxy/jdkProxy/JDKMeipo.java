package com.tianhy.designpattern.structural.proxy.dynamicProxy.jdkProxy;

import com.tianhy.designpattern.structural.proxy.staticProxy.Person;

import java.lang.reflect.*;

/**
 * @Desc: JDK动态代理是通过实现被代理的接口，而CGlib是继承被代理的类
 * @Author: thy
 * @CreateTime: 2019/3/15
 **/
public class JDKMeipo implements InvocationHandler {
    /**被代理的对象,接口*/
    private Person target;


    public Object getInstance(Person target) {
        //把被代理的引用保存
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
//        return Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz},this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }

}
