package com.tianhy.designpattern.decorator.version2;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() +1;
    }


}
