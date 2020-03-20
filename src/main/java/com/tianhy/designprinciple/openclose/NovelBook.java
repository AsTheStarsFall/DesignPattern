package com.tianhy.designprinciple.openclose;

/**
 * {@link}
 *
 * @Desc: 书籍具体的实现类，是所有小说书籍的总称
 * @Author: thy
 * @CreateTime: 2020/3/9 4:05
 **/
public class NovelBook implements IBook {

    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
