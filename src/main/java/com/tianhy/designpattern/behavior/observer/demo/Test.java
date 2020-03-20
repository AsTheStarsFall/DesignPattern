package com.tianhy.designpattern.behavior.observer.demo;

/**
 * @Author: thy
 * @Date: 2020/2/17 15:26
 * @Desc: 发布/订阅 测试
 */
public class Test {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();

        observable.addObserver(new MyObserver());
        //推送消息
        observable.pushMessage("hi");
    }
}
