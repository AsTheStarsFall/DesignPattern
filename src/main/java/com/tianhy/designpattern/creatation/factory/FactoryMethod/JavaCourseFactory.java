package com.tianhy.designpattern.creatation.factory.FactoryMethod;


import com.tianhy.designpattern.creatation.factory.ICourse;
import com.tianhy.designpattern.creatation.factory.JavaCourse;

/**
 * @Desc: 让子类去实例化类
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
