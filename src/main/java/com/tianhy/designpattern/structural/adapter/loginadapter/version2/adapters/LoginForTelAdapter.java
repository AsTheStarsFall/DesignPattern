package com.tianhy.designpattern.structural.adapter.loginadapter.version2.adapters;


import com.tianhy.designpattern.structural.adapter.loginadapter.ResultMsg;


/**
 * 每一种登陆方式都有自己的适配器
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
