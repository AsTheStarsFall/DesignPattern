package com.tianhy.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc: 策略工厂类
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class HeroStrategyFactory {
    private static final String RIVEN = "Riven";
    private static final String VN = "vn";
    private static final String LUCIAN = "Lucian";

    private static Map<String, HeroStrategy> HERO_STRATEGY_MAP = new HashMap<>();
    private static final HeroStrategy RANDOM_HERO = new RandomHeroStrategy();

    //只加载一次
    static {
        HERO_STRATEGY_MAP.put(RIVEN, new RivenStrategy());
        HERO_STRATEGY_MAP.put(VN, new VNStrategy());
        HERO_STRATEGY_MAP.put(LUCIAN, new LucianStrategy());
    }

    public HeroStrategyFactory() {
    }

    public static HeroStrategy getHeroStrategy(String heroName) {
        HeroStrategy heroStrategy = HERO_STRATEGY_MAP.get(heroName);
        //如果没有选择英雄，则创建一个随机英雄
        return heroStrategy == null ? RANDOM_HERO : heroStrategy;
    }
}
