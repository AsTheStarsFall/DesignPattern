package com.tianhy.designpattern;

import com.tianhy.designprinciple.openclose.IBook;
import com.tianhy.designprinciple.openclose.NovelBook;
import junit.framework.TestCase;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/9 4:38
 **/
public class BookStoreTest extends TestCase {

    private String name = "三体";
    private int price = 6000;
    private String author = "刘欣慈";

    private IBook novelBook = new NovelBook(name,price,author);

    public void testGetPrice(){
        super.assertEquals(this.price,this.novelBook.getPrice());
    }
}
