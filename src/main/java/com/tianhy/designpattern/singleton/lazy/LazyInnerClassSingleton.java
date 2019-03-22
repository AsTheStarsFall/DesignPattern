package com.tianhy.designpattern.singleton.lazy;

/**
 * @Desc: 类加载机制避免synchronized关键字
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class LazyInnerClassSingleton {

    //会被反射破坏
    //如果用反射调用，直接抛出异常
    private LazyInnerClassSingleton(){
//        if(LazyHolder.lazy != null){
//            throw new RuntimeException("不允许创建多个实例");
//        }
    }

    //懒汉式单例，外部调用内部类才加载
    public static final LazyInnerClassSingleton getInstance(){
       return LazyHolder.lazy;
    }

    //优先加载内部类
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}
