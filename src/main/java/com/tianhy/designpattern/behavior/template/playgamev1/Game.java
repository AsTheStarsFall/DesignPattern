package com.tianhy.designpattern.behavior.template.playgamev1;


/**
 * @Desc: abstract：1.抽象类不能被实例化
 *                  2.继承抽象类的子类，必须覆盖父类的抽象函数
 *
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public abstract class Game {

    /**
     * protected对于子类可见，对于其他类不可见
     * final 不允许子类重写
     */
    protected final void playLol(){
         //1.选择英雄
        this.chooseHero();
        //2.选择天赋以及符文
        this.chooseRune();
        //3.选择召唤师技能
        this.chooseDF();

        //如果有皮肤，选择皮肤
        if(isRich()){
            chooseHeroSkin();
        }
    }

    //有些人有皮肤
    abstract void chooseHeroSkin();

    //钩子方法：实现流程的微调
    protected boolean isRich(){return false;}

    final void chooseDF(){
        System.out.println("选择召唤师技能");
    }

    final void chooseRune(){
        System.out.println("选择天赋符文");
    }

    final void chooseHero(){
        System.out.println("选择英雄");
    }
}
