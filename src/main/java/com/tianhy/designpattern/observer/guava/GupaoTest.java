package com.tianhy.designpattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Desc: 测试类
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class GupaoTest {
    public static void main(String[] args) {
        //发布者
        Publisher publisher = new Publisher(new EventBus());
        //订阅者
        Observer tom = new Observer("Tom老师");
        Observer mic = new Observer("Mic老师");
        //内容
        publisher.setPublisherName("咕泡学员");
        publisher.setQuestion("请问怎么才能变帅？");
        //注册
        publisher.register(tom);
        publisher.register(mic);
        //发布
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
