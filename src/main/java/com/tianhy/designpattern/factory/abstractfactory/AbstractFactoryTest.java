package com.tianhy.designpattern.factory.abstractfactory;

/**
 * @Desc: 特点：同一产品族
 *        缺点：扩展新产品困难
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
