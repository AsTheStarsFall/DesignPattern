package com.tianhy.designpattern.singleton.hungry;

/**
 * @Desc: 饿汉式单例,在类加载的时候就初始化，并且创建单例对象
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class HungrySingleton {

   // private static final HungrySingleton hungrySingleton = new HungrySingleton();


   //另外一种写法，静态代码块
   private static final HungrySingleton hungrySingleton;
   //static代码块只会执行一次
    static {
        hungrySingleton = new HungrySingleton();
    }


    private HungrySingleton(){}
    //全局访问点
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }










}
