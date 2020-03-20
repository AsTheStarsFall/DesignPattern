package com.tianhy.designprinciple.LSP.book.soldier;

import com.tianhy.designprinciple.LSP.book.gun.AbstractGun;
import com.tianhy.designprinciple.LSP.book.gun.ToyGun;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:53
 * @Desc: 使用枪的士兵
 */
public class Soldier {

    //注入枪
    private AbstractGun gun;

    //给士兵设置一把枪,枪是抽象的，具体实现类是什么，要到具体的场景再决定
    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    //士兵的功能
    public void killEnemy() {
        System.out.println("Soldier kill enemy");
        gun.shoot();
    }
}
