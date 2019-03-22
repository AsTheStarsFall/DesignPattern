package com.tianhy.designpattern.factory.abstractfactory;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class PhpNote implements INote{

    @Override
    public void edit() {
        System.out.println("php笔记");
    }
}
