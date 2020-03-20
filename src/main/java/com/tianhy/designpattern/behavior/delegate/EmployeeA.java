package com.tianhy.designpattern.behavior.delegate;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class EmployeeA implements Employ{
    @Override
    public void doingWork(String task) {
        System.out.println("A的任务:"+ task);
    }
}
