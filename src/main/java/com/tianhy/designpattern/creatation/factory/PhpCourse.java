package com.tianhy.designpattern.creatation.factory;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class PhpCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("Php录制");
    }

}
