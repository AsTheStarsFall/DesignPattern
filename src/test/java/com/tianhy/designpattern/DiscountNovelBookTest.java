package com.tianhy.designpattern;

import com.tianhy.designprinciple.openclose.DiscountNovelBook;
import com.tianhy.designprinciple.openclose.IBook;
import junit.framework.TestCase;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/9 4:46
 **/
public class DiscountNovelBookTest extends TestCase {
    private IBook above40NovelBook = new DiscountNovelBook("三体", 5000, "刘欣慈");
    private IBook below40NovelBook = new DiscountNovelBook("人间失格", 3000, "太宰治");

    public void testGetPriceBelow40() {
        super.assertEquals(2400, this.below40NovelBook.getPrice());
    }

    public void testGetPriceAbove40() {
        super.assertEquals(4500 , this.above40NovelBook.getPrice());
    }
}
