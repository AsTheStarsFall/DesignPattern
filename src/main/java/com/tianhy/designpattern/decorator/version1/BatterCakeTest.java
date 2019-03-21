package com.tianhy.designpattern.decorator.version1;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/22
 **/
public class BatterCakeTest {
    public static void main(String[] args) {

        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg()+",总价格："+ batterCake.getPrice());

        BatterCake withEgg = new BatterCakeWithEgg();
        System.out.println(withEgg.getMsg()+",总价格："+ withEgg.getPrice());

        BatterCake withEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(withEggAndSausage.getMsg()+",总价格："+ withEggAndSausage.getPrice());



    }
}

