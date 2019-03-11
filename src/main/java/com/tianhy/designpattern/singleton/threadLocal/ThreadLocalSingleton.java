package com.tianhy.designpattern.singleton.threadLocal;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/12
 **/
public class ThreadLocalSingleton {
    //ThreadLocal 不能保证其
    //创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
