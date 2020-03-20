package com.tianhy.designprinciple.LSP.book.gun;

/**
 * @Author: thy
 * @Date: 2020/2/23 0:49
 * @Desc: AUG属于Rifle，为了说明：有子类出现的地方，父类未必就可以出现
 */
public class AUG extends Rifle {

    public void zoomOut() {
        System.out.println("AUG 开启狙击镜模式");
    }

    @Override
    public void shoot() {
        System.out.println("AUG shooting");
    }
}
