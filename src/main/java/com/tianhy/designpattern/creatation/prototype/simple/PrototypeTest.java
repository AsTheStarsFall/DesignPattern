package com.tianhy.designpattern.creatation.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 适用场景：
 *
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class PrototypeTest {

    public static void main(String[] args) {
        //创建一个需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        List hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("thy");

        System.out.println(concretePrototypeA);

        //client克隆
        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(copy);

        System.out.println("原对象："+ concretePrototypeA.getName());
        System.out.println("克隆对象: " + copy.getName());

        System.out.println(concretePrototypeA.getName() == copy.getName());
        //true
        //克隆的是引用地址，如果原型的值改变，克隆对象里的值也随之改变，这就是浅克隆

    }
}
