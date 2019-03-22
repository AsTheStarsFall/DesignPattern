package com.tianhy.designpattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe1(String str){
        System.out.println("执行subscribe1方法，传入的参数是：" + str);
    }

}
