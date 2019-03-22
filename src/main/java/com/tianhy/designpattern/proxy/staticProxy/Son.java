package com.tianhy.designpattern.proxy.staticProxy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class Son implements Person{
    @Override
    public void findLove() {
        System.out.println("son 要求：灵魂伴侣");
    }

    @Override
    public void findSomeOne() {
        System.out.println("son 找人");
    }
}
