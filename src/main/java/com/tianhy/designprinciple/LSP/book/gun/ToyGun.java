package com.tianhy.designprinciple.LSP.book.gun;

/**
 * @Author: thy
 * @Date: 2020/2/23 0:25
 * @Desc: 新增一个玩具枪，玩具枪不适合真枪的应用场景
 * 有两种解决办法：
 * 1、在soldier中instanceof类型，如果是玩具枪则不执行killEnemy方法
 * 缺点：在程序中，每增加一个类，所有与这个改动了的类有关系的类都要修改
 * 2、将ToyGun独立出来
 */
public class ToyGun extends AbstractToy {

    @Override
    public void shoot() {
        super.shoot();
    }

}
