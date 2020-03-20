package com.tianhy.designpattern.structural.decorator.version2;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BatterCakeTest {

    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ",总价：" + batterCake.getPrice());

    }
}
