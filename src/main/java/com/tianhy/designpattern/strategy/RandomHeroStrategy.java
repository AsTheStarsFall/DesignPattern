package com.tianhy.designpattern.strategy;

/**
 * @Desc: 随机英雄
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class RandomHeroStrategy implements HeroStrategy {
    @Override
    public void createHero() {
        System.out.println("create a random hero!");
    }
}
