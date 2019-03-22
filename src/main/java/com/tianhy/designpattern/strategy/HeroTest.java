package com.tianhy.designpattern.strategy;


/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class HeroTest {

    public static void main(String[] args) {


        String heroName = "";
        Hero hero = new Hero(HeroStrategyFactory.getHeroStrategy(heroName));
        hero.createHero();

    }
}
