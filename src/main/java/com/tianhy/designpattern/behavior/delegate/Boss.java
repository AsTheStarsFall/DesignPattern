package com.tianhy.designpattern.behavior.delegate;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class Boss {
    public void command(String command,Leader leader){
        leader.dispatcher(command);
    }
}
