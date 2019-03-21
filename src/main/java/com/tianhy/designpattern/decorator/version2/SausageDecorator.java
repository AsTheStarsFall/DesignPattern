package com.tianhy.designpattern.decorator.version2;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() +2;
    }


}
