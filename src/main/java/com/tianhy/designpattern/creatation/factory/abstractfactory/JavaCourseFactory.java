package com.tianhy.designpattern.creatation.factory.abstractfactory;


/**
 * @Desc: Java产品族具体工厂类，在这里实例化对象
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class JavaCourseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
