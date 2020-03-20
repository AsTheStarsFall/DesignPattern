package com.tianhy.designpattern.behavior.strategy;

/**
 * @Desc: 英雄
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class Hero {

    private HeroStrategy heroStrategy;

    public Hero(HeroStrategy heroStrategy) {
        this.heroStrategy = heroStrategy;
    }

    void createHero(){
        heroStrategy.createHero();
    }
}
