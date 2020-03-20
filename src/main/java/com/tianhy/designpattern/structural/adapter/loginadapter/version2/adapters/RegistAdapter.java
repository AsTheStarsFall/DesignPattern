package com.tianhy.designpattern.structural.adapter.loginadapter.version2.adapters;


import com.tianhy.designpattern.structural.adapter.loginadapter.ResultMsg;



public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
