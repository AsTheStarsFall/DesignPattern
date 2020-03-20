package com.tianhy.designprinciple.LSP.book.args;

import java.util.HashMap;

/**
 * @Author: thy
 * @Date: 2020/2/23 1:17
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {

        Father f = new Father();

/*
        //有父类的地方，子类就可以出现，此时执行的是子类的逻辑
        //子类中方法前置条件必须与超类中被覆写的方法的前置条件相同或更宽松
        Son f = new Son();
 */
        HashMap map = new HashMap();
        f.doSomething(map);
    }
}
