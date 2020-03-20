package com.tianhy.designprinciple.LSP.book.gun;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:51
 * @Desc:
 */
public class Rifle extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("Rifle shooting...");
    }
}
