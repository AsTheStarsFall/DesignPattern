package com.tianhy.designpattern.adapter.loginadapter.version2.adapters;


import com.tianhy.designpattern.adapter.loginadapter.ResultMsg;



public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
