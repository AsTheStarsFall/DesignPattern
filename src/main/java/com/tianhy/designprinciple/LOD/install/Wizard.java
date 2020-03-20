package com.tianhy.designprinciple.LOD.install;

import java.util.Random;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 7:52
 **/
public class Wizard {

    private Random random = new Random(System.currentTimeMillis());

    public int first() {
        System.out.println("first step");
        return random.nextInt(100);
    }

    public int second() {
        System.out.println("second step");
        return random.nextInt(100);
    }

    public int third() {
        System.out.println("third step");
        return random.nextInt(100);
    }

    public void installWizard() {
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }
}
