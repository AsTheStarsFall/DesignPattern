package com.tianhy.designprinciple.openclose;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * {@link}
 *
 * @Desc: 书店售书类
 * @Author: thy
 * @CreateTime: 2020/3/9 4:07
 **/
public class BookStore {

    private final static ArrayList<IBook> BOOKS = new ArrayList<>(4);

    //静态代码块初始化数据。在非金融类项目中对货币处理时，一般取2位精度，通常的设计方法是在运算过程中扩大100倍
    //在需要展示时再缩小100倍，减少精度带来的误差
    static {
/*
        //原始系统
        BOOKS.add(new NovelBook("设计模式", 3000, "aaa"));
        BOOKS.add(new NovelBook("多线程", 2500, "bbb"));
        BOOKS.add(new NovelBook("微服务", 6000, "ccc"));
*/
        //新需求：打折
        //初始化数据的时候，改变原来的价格策略，填入新增的扩展实现类
        BOOKS.add(new DiscountNovelBook("设计模式", 3000, "aaa"));
        BOOKS.add(new DiscountNovelBook("多线程", 2500, "bbb"));
        BOOKS.add(new DiscountNovelBook("微服务", 6000, "ccc"));

        //新增计算机书籍
        BOOKS.add(new ComputerBook("Effective Java", 4500, "ddd", "Java"));

    }

    //模拟书店售书流程
    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setMaximumFractionDigits(2);

        for (IBook book : BOOKS) {
            System.out.println("书籍名称：" + book.getName() + ",书籍价格：" + numberFormat.format(book.getPrice() / 100.0) + ",书籍作者：" + book.getAuthor());
        }

    }

}
