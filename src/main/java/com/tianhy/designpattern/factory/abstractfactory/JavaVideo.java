package com.tianhy.designpattern.factory.abstractfactory;

/**
 * @Desc: java产品族
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("java录制");
    }
}
