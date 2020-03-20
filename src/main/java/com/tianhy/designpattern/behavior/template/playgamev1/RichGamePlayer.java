package com.tianhy.designpattern.behavior.template.playgamev1;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class RichGamePlayer extends Game {

    private boolean isRich = false;

    public RichGamePlayer(boolean isRich) {
        this.isRich = isRich;
    }

    @Override
    void chooseHeroSkin() {
        System.out.println("选择皮肤");
    }

    @Override
    protected boolean isRich() {
        return this.isRich;
    }
}
