package com.tianhy.designprinciple.LSP.book.args;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: thy
 * @Date: 2020/2/23 1:14
 * @Desc:
 */
public class Father {

    public Collection doSomething(Map map) {
        System.out.println("Father executed");
        return map.values();
    }
}
