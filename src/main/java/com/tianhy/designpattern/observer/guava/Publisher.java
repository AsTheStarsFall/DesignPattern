package com.tianhy.designpattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionHandler;
import lombok.Getter;
import lombok.Setter;

/**
 * @Desc: 发布者
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
@Setter
@Getter
public class Publisher extends EventBus {
    private String publisherName;
    private Object question;
    public String gupao = "Gper生态圈";
    private EventBus eventBus;

    public Publisher(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Publisher(String identifier, EventBus eventBus) {
        super(identifier);
        this.eventBus = eventBus;
    }

    public Publisher(SubscriberExceptionHandler exceptionHandler, EventBus eventBus) {
        super(exceptionHandler);
        this.eventBus = eventBus;
    }

    @Override
    public void post(Object event) {
        System.out.println(publisherName+ " 在"+ gupao+"发布了一个问题");
        System.out.println("===================");
        super.post(event);
    }
}
