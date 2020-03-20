package com.tianhy.designpattern.structural.decorator.version1;

/**
 * @Desc: 基础煎饼模板
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BatterCake {
    protected String getMsg(){
        return "煎饼";
    }
    protected int getPrice(){
        return 5;
    }
}
