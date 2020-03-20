package com.tianhy.designprinciple.LSP.book.soldier;

import com.tianhy.designprinciple.LSP.book.gun.AUG;
import com.tianhy.designprinciple.LSP.book.gun.AbstractGun;

/**
 * @Author: thy
 * @Date: 2020/2/23 0:58
 * @Desc:
 */
public class Snipper {

    private AUG aug;

    public void setAug(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        System.out.println("Snipper kill enemy");
        aug.zoomOut();
        aug.shoot();
    }
}
