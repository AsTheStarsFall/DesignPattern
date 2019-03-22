package com.tianhy.designpattern.factory.simpleFactory;

import com.tianhy.designpattern.factory.ICourse;
import com.tianhy.designpattern.factory.JavaCourse;

/**
 * @Desc: 场景：工厂类负责创建的对象较少。
 *        特点：根据参数获取对象
 *        缺点：不利于增加新产品
 *        只需要一个工厂
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {

        // ICourse course = new JavaCourse();
        //course.record();

        //工厂模式
        CourseFactory factory = new CourseFactory();

        //factory.create("java").record();
        //类名反射
        //factory.create("com.tianhy.designpattern.factory.JavaCourse").record();

        //类反射
        ICourse iCourse = factory.create(JavaCourse.class);
        iCourse.record();

    }
}
