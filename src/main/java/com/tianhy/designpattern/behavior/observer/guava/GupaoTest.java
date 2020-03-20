package com.tianhy.designpattern.behavior.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Desc: 测试类
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class GupaoTest {
    public static void main(String[] args) {
        //被观察者
        Publisher publisher = new Publisher(new EventBus());
        //观察者
        Observer tom = new Observer("Tom老师");
        Observer mic = new Observer("Mic老师");
        //内容
        publisher.setPublisherName("咕泡学员");
        publisher.setQuestion("请问怎么才能变帅？");
        //注册观察者
        publisher.register(tom);
        publisher.register(mic);
        //被观察者发起事件，被观察者的事件类型与观察者的监听方法类型一致
        publisher.post(publisher);

        /**
         * 咕泡学员 在Gper生态圈发布了一个问题
         * ===================
         * Tom老师您好！
         * 您收到一条来自“Gper生态圈”的消息,内容是：
         * 请问怎么才能变帅？
         * 发布者：咕泡学员
         *
         * ===================
         * Mic老师您好！
         * 您收到一条来自“Gper生态圈”的消息,内容是：
         * 请问怎么才能变帅？
         * 发布者：咕泡学员
         *
         * ===================
         */
    }
}
