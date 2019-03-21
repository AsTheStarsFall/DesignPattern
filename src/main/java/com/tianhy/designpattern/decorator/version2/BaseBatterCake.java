package com.tianhy.designpattern.decorator.version2;

/**
 * @Desc: 实现基础煎饼的方法
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
