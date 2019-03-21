package com.tianhy.designpattern.template;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PoorGamePlayer extends Game{

    @Override
    void chooseHeroSkin() {
        System.out.println("使用原画皮肤");
    }
}
