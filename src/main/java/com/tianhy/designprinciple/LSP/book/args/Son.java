package com.tianhy.designprinciple.LSP.book.args;

import java.util.*;

/**
 * @Author: thy
 * @Date: 2020/2/23 1:15
 * @Desc:
 */
public class Son extends Father {

    //重载父类的方法,参数比父类的小
    public Collection doSomething(HashMap map) {
        System.out.println("Son executed（重载）");
        return map.values();
    }

    @Override
    public Collection doSomething(Map map) {
        System.out.println("Son executed (覆写)");
        //覆写或实现父类的方法时，返回值必须小于等于父类的返回值
        List<?> list = new ArrayList<>();
        return list;
    }
}
