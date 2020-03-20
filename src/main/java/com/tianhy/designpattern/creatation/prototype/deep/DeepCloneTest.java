package com.tianhy.designpattern.creatation.prototype.deep;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class DeepCloneTest {

    public static void main(String[] args) {

        QitianDasheng original = new QitianDasheng();

        try {
            QitianDasheng copy = (QitianDasheng) original.clone();
            System.out.println("深克隆："+ (original.jinGuBang == copy.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        QitianDasheng original1 = new QitianDasheng();
        QitianDasheng copy1= original1.shallowClone(original1);
        System.out.println("浅克隆："+ (original1.jinGuBang == copy1.jinGuBang));


        /**
         * 总结：浅克隆只是克隆原对象的引用，如果原对象值改变了，克隆也随之改变
         *      深克隆是生成一个新的对象，引用自然与原对象不一样
         */
    }
}
