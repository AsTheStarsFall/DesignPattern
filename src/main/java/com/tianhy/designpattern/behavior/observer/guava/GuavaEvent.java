package com.tianhy.designpattern.behavior.observer.guava;

import com.google.common.eventbus.Subscribe;


/**
 *
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe1(String str){
        System.out.println("执行subscribe1方法，传入的参数是：" + str);
    }

}
