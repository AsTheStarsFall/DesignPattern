package com.tianhy.designpattern.prototype.masteryi;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class jsTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Jiansheng js = new Jiansheng();
        js.setDamage(98);
        js.setName("js");

        System.out.println("本体："+js);
        System.out.println("本体的攻击力："+ js.getDamage());
        Jiansheng fs = (Jiansheng) js.clone();
        System.out.println("分身的攻击力:"+ fs.getDamage());
        System.out.println(fs.getName());
        System.out.println("分身:"+ fs);
        System.out.println(fs.getDamage() == js.getDamage());
        //false

    }
}
