package com.tianhy.designpattern.creatation.factory.abstractfactory;

/**
 * @Desc: java产品族中的java笔记
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("java笔记");
    }
}
