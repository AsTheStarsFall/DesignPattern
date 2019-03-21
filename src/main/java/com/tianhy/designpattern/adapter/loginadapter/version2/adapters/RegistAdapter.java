package com.tianhy.designpattern.adapter.loginadapter.version2.adapters;


import com.tianhy.designpattern.adapter.loginadapter.ResultMsg;



public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
