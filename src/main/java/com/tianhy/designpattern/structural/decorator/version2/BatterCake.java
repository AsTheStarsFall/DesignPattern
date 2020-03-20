package com.tianhy.designpattern.structural.decorator.version2;

/**
 * @Desc: 基础煎饼的模板，只提供方法
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public abstract class BatterCake {
    protected abstract String getMsg();
    protected abstract int getPrice();
}
