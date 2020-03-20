package com.tianhy.designpattern.creatation.factory;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("Java录制");
    }

}
