package com.tianhy.designprinciple.LSP.book;

import com.tianhy.designprinciple.LSP.book.gun.AUG;
import com.tianhy.designprinciple.LSP.book.gun.Rifle;
import com.tianhy.designprinciple.LSP.book.gun.ToyGun;
import com.tianhy.designprinciple.LSP.book.soldier.Snipper;
import com.tianhy.designprinciple.LSP.book.soldier.Soldier;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:56
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {

/*        Soldier soldier = new Soldier();
//        soldier.setGun(new Rifle());
        soldier.setGun(new ToyGun());
        soldier.killEnemy();*/
        Snipper snipper = new Snipper();
        snipper.setAug(new AUG());
/*
        //如果设置AUG的父类,会发生ClassCast异常，向下转型是不安全的
        说明有子类出现的地方，父类未必就可以出现
        snipper.setAug((AUG) new Rifle());
*/
        snipper.killEnemy();
    }


}
