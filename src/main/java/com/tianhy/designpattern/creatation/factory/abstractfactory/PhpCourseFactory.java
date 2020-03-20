package com.tianhy.designpattern.creatation.factory.abstractfactory;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class PhpCourseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new PhpNote();
    }

    @Override
    public IVideo createVideo() {
        return new PhpVideo();
    }
}
