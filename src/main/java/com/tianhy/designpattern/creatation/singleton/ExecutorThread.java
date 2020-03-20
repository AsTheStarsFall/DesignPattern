package com.tianhy.designpattern.creatation.singleton;

import com.tianhy.designpattern.creatation.singleton.lazy.LazyDoubleCheckSingleton;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazySimpleSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+ lazySimpleSingleton);
    }
}
