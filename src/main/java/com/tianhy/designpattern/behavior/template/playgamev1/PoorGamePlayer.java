package com.tianhy.designpattern.behavior.template.playgamev1;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PoorGamePlayer extends Game {
    @Override
    void chooseHeroSkin() {
        System.out.println("使用原画皮肤");
    }
}
