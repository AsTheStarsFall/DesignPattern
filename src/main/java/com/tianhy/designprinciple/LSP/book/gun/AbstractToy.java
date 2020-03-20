package com.tianhy.designprinciple.LSP.book.gun;

/**
 * @Author: thy
 * @Date: 2020/2/23 0:38
 * @Desc:
 */
public abstract class AbstractToy extends AbstractGun{


    @Override
    public void shoot() {
        System.out.println("ToyGun shooting");
    }

}
