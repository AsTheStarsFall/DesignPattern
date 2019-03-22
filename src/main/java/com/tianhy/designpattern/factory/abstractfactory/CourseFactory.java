package com.tianhy.designpattern.factory.abstractfactory;

/**
 * @Desc: 抽象工厂接口
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public interface CourseFactory {
    //规定好产品等级
    INote createNote();
    IVideo createVideo();

}
