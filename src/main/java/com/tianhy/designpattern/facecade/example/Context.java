package com.tianhy.designpattern.facecade.example;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/5 6:47
 **/
public class Context {

    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    //
    public void func(){
        a.dosomething();
        c.dosomething();
    }
}
