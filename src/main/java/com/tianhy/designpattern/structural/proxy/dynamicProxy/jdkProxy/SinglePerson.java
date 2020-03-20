package com.tianhy.designpattern.structural.proxy.dynamicProxy.jdkProxy;

import com.tianhy.designpattern.structural.proxy.staticProxy.Person;

/**
 * @Desc: 广大单身
 * @Author: thy
 * @CreateTime: 2019/3/15
 **/
public class SinglePerson implements Person {
    @Override
    public void findLove() {
        System.out.println("我的要求是xxxx");
    }

    @Override
    public void findSomeOne() {
        System.out.println("找人");
    }

    @Override
    public void findMan() {

    }


}
