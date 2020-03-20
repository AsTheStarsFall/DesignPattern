package com.tianhy.designpattern.structural.proxy.dynamicProxy.CGLibProxy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/25
 **/
public class CGLibTest {

    public static void main(String[] args) {
        Custom custom = (Custom) new Agency().getInstance(Custom.class);
        custom.finHouse();
    }
}
