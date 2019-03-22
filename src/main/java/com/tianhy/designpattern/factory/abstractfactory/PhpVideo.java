package com.tianhy.designpattern.factory.abstractfactory;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class PhpVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("php视频");
    }
}
