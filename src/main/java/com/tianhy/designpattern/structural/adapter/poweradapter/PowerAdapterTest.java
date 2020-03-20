package com.tianhy.designpattern.structural.adapter.poweradapter;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5();
    }
}
