package com.tianhy.designpattern.proxy.staticProxy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class Father {

    private Person person;

    public Father(Person person) {
        //将要代理的引用传进来
        this.person = person;
    }
    public void findLove(){
        System.out.println("代理开始");
        //拿到要代理的目标引用，这个时候就是代理儿子找对象
        //这个地方就是静态代理的局限性
        this.person.findLove();
        System.out.println("等待结果");
    }
}
