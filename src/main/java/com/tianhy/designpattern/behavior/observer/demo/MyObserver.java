package com.tianhy.designpattern.behavior.observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: thy
 * @Date: 2020/2/17 15:25
 * @Desc: 订阅
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到通知："+arg);

    }
}
