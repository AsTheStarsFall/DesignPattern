package com.tianhy.designpattern.singleton;

import com.tianhy.designpattern.singleton.lazy.LazySimpleSingleton;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+ lazySimpleSingleton);

    }
}
