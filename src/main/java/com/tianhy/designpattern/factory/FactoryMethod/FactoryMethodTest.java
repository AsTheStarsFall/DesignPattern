package com.tianhy.designpattern.factory.FactoryMethod;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();
        factory = new PhpCourseFactory();
        factory.create().record();
    }
}
