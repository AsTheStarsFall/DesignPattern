package com.tianhy.designpattern.singleton.lazy;

import com.tianhy.designpattern.singleton.ExecutorThread;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/11
 **/
public class LazySimpleSingleTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        System.out.println("end");
    }
}
