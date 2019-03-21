package com.tianhy.designpattern.decorator.version2;

/**
 * @Desc: 煎饼装饰器
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return batterCake.getPrice();
    }
}
