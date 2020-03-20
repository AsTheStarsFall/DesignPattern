package com.tianhy.designpattern.structural.adapter.loginadapter.version2;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class PassportForThirdTest {

    public static void main(String[] args) {
        PassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");
        ((PassportForThirdAdapter) passportForThird).login("","");
    }
}
