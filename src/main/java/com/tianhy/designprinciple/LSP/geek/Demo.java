package com.tianhy.designprinciple.LSP.geek;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:16
 * @Desc:
 */
public class Demo {

    //定义一个方法，参数是原生类
    public void functon(Original original) {
        Request request = new Request();
        original.func(request);
    }
}
