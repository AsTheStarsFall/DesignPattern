package com.tianhy.designpattern.creatation.singleton.lazy;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @Desc: 反射攻击单例
 * @Author: thy
 * @CreateTime: 2019/3/12
 **/
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            //实例化
            Object o1 = c.newInstance();
            System.out.println(Arrays.toString(o1.getClass().getMethods()));
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
