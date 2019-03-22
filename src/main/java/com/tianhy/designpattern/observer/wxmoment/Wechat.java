package com.tianhy.designpattern.observer.wxmoment;

import java.util.Observable;

/**
 * @Desc: 微信
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class Wechat extends Observable {
    private String weChatMoment = "微信朋友圈";
    public Wechat() {
    }
    private static Wechat community = null;

    public static Wechat getInstance(){
        //非空判断，第二次调用会覆盖
        if(community == null){
            community = new Wechat();
        }
        return community;
    }

    public String getWeChatMoment() {
        return weChatMoment;
    }

    public void publishQuesion(User user){
        System.out.println(user.getUserName() + "在"+ weChatMoment +"发布了一条说说，内容是：\n"
        + user.getContent());
        setChanged();
        notifyObservers(user);
    }


}
