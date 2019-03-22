package com.tianhy.designpattern.observer.wxmoment;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class MomentTest {

    public static void main(String[] args) {
        Wechat wechat = Wechat.getInstance();

        //发起者
        User user = new User();
        user.setUserName("朋友甲");
        user.setContent("我先睡了，好了叫我。");
        //观察者
        Contact contact =new Contact("xxx");

        wechat.addObserver(contact);
        wechat.publishQuesion(user);

    }
}
