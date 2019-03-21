package com.tianhy.designpattern.delegate;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("服务",new Leader());
    }
}
