package com.tianhy.designpattern.facecade.example;

/**
 * {@link}
 *
 * @Desc: 门面，给外部提供子系统访问的方法
 * @Author: thy
 * @CreateTime: 2020/3/5 6:23
 **/
public class FaceCade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    private Context context = new Context();

    //给外部提供访问子系统的方法
    public void methodA() {
        a.dosomething();
    }

    public void methodB() {
        b.dosomething();
    }

    public void methodC() {
        //新增一个需求：先调用A方法，才能执行C方法。但如果在这里调用就破坏了门面的，门面不参与子系统内部的逻辑
        //方案：封装一个类Context，把先执行A后执行C的逻辑封装，调用封装类的方法
//        c.dosomething();
        context.func();

    }
}
