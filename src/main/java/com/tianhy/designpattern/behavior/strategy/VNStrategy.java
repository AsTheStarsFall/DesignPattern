package com.tianhy.designpattern.behavior.strategy;


/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class VNStrategy implements HeroStrategy
{
    @Override
    public void createHero() {
        System.out.println("create hero VN!");
    }

}
