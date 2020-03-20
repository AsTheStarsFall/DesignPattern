package com.tianhy.designpattern.creatation.singleton.lazy;

/**
 * @Desc: 懒汉式单例，类加载的时候不初始化，只有在外部调用的时候实例化
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSingleton = null;

    //加上synchronized关键字后，一个线程执行完，下一个线程 才会被执行
    //弊端：线程数量多的情况下,CPU占用过高，会出现线程阻塞
    //优化方案：doubleCheck 双if加锁
    public synchronized static LazySimpleSingleton getInstance(){
        //非空判断，如果第二次调用会覆盖
        /**
         * 多线程下有几种情况：
         * 1：线程1先执行完并且打印，线程2不进入判断，直接返回线程1的实例
         * 2：两个线程同时进入判断，线程1执行完再执行线程2，这时候线程2会覆盖线程1，最后得到相同的打印
         * 3：两个线程同时进入判断，线程1执行完并且打印，再执行线程2并且打印，得到不同的值
         */
        if(lazySimpleSingleton == null){
            //分配内存给对象，引用指向这个内存地址
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
