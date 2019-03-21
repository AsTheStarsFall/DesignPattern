package com.tianhy.designpattern.decorator.version1;

/**
 * @Desc: 每次要在原来的对象附加功能
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
