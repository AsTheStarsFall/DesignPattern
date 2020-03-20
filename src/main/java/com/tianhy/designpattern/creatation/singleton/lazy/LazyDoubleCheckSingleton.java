package com.tianhy.designpattern.creatation.singleton.lazy;

/**
 * @Desc: 2if + 锁
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class LazyDoubleCheckSingleton {

    //私有化构造函数
    private LazyDoubleCheckSingleton(){}

    private static LazyDoubleCheckSingleton lazy = null;

    //synchronized锁总归还是对性能有影响
    //更好的优化方案：静态内部类
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                //多线程同时进入，线程1执行完，线程2再执行，所以赋值两次，所以再加一次if判断
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
            //此处线程1执行完，线程2再进行赋值
        }
        return lazy;
    }
}
