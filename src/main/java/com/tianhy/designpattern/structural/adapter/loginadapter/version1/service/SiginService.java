package com.tianhy.designpattern.structural.adapter.loginadapter.version1.service;


import com.tianhy.designpattern.structural.adapter.loginadapter.Member;
import com.tianhy.designpattern.structural.adapter.loginadapter.ResultMsg;


/**
 * 原始的登陆接口
 */
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password){
        return null;
    }

}
