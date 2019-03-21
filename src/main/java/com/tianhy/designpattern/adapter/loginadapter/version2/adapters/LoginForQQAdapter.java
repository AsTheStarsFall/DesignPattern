package com.tianhy.designpattern.adapter.loginadapter.version2.adapters;

import com.tianhy.designpattern.adapter.loginadapter.ResultMsg;

/**
 * @Desc: 每一种登陆方式都有自己的适配器
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class LoginForQQAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
