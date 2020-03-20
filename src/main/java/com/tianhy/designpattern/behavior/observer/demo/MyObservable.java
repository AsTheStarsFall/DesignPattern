package com.tianhy.designpattern.behavior.observer.demo;

import java.util.Observable;

/**
 * @Author: thy
 * @Date: 2020/2/17 15:20
 * @Desc: 发布
 */
public class MyObservable extends Observable {


    public void pushMessage(String msg) {

        super.setChanged();
        //回调通知观察者
        super.notifyObservers(msg);

    }

}
