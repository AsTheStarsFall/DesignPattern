package com.tianhy.designpattern.singleton.lazy;

/**
 * @Desc: 2if + 锁
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private static LazyDoubleCheckSingleton lazy = null;

    public synchronized static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                //多线程同时进入，线程1执行完，线程2再执行，所以赋值两次，所以再加一次if判断
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
