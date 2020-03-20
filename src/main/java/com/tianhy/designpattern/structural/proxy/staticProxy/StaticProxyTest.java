package com.tianhy.designpattern.structural.proxy.staticProxy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class StaticProxyTest {

    public static void main(String[] args) {
        /**
         * 只能通过Father来代理，不能通过Person代理
         * 如果说在Person接口新增方法，通过Father代理就不能实现了
         * 而动态代理直接通过Person代理可以实现新增的方法
         */

        Father father = new Father(new Son());
        father.findLove();

    }
}
