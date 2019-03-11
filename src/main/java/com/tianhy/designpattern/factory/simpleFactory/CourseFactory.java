package com.tianhy.designpattern.factory.simpleFactory;

import com.tianhy.designpattern.factory.ICourse;

/**
 * @Desc: 只需要一个参数就可以获取所需对象
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class CourseFactory {

    //将参数写死
/*    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("php".equals(name)){
            return new PhpCourse();
        }else{
            return null;
        }
    }*/

    //利用类名反射
/*    public ICourse create(String className){
        try {
            if(!(null == className || "".equals(className))){
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

    //利用类反射
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if(null != clazz){
            return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    }
