package com.tianhy.designpattern.behavior.observer.guava;

import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import lombok.Setter;


/**
 * @Desc: 观察者
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
@Setter
@Getter
public class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    //定义监听方法，参数为被观察者
    @Subscribe
    public void func(Publisher publisher){
        System.out.println(name +"您好！\n"+
                "您收到一条来自“"+ publisher.gupao+"”的消息,内容是：\n"
                +publisher.getQuestion()+"\n"+
                "发布者："+publisher.getPublisherName()+"\n");
        System.out.println("===================");

    }
}
