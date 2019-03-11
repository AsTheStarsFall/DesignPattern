package com.tianhy.designpattern;

/**
 * @Desc: 类加载顺序
 * @Author: thy
 * @CreateTime: 2019/3/9
 **/
public class ClassLoadDemo {

    public static int X = 100;

    public final static int Y = 200;

    //每次实例化都会执行构造函数
    public ClassLoadDemo()
    {
        System.out.println("Test构造函数执行");
    }
    //只会执行一次
    static
    {
        System.out.println("static语句块执行");
    }

    public static void display()
    {
        System.out.println("静态方法被执行");
    }

    public void display_1()
    {
        System.out.println("实例方法被执行");
    }
}
