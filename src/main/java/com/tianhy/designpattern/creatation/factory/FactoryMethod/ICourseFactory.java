package com.tianhy.designpattern.creatation.factory.FactoryMethod;

import com.tianhy.designpattern.creatation.factory.ICourse;

/**
 * @Desc: 定义一个创建对象的接口,让实现该接口的类去决定实例化哪个类
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public interface ICourseFactory {
    ICourse create();
}
