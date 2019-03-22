package com.tianhy.designpattern.observer.wxmoment;

import java.util.Observable;
import java.util.Observer;

/**
 * @Desc: 观察者
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class Contact implements Observer {

    private String name;

    public Contact(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Wechat wechat = (Wechat)o;
        //发布者
        User user = (User) arg;
        System.out.println(name +"收到一条来自好友："+ user.getUserName()+" 的"+ wechat.getWeChatMoment()+"消息\n"+
                "内容是："+ user.getContent()+ "\n");
    }
}
