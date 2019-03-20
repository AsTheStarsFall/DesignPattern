package com.tianhy.designpattern.strategy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class RivenStrategy implements HeroStrategy{
    @Override
    public void createHero() {
        System.out.println("create hero Riven!");
    }
}
