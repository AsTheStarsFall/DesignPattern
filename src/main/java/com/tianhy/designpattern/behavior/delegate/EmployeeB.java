package com.tianhy.designpattern.behavior.delegate;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class EmployeeB implements Employ{
    @Override
    public void doingWork(String task) {
        System.out.println("B的任务:"+ task);
    }
}
