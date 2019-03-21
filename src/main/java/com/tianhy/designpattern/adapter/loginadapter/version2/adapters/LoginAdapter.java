package com.tianhy.designpattern.adapter.loginadapter.version2.adapters;

import com.tianhy.designpattern.adapter.loginadapter.ResultMsg;

/**
 * @Desc: 登陆适配器
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
