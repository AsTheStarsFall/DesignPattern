package com.tianhy.designprinciple.LSP.book.gun;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:49
 * @Desc:
 */
public class HandGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("HandGun shooting...");
    }
}
