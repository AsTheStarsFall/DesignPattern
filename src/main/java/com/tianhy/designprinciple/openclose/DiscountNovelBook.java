package com.tianhy.designprinciple.openclose;

/**
 * {@link}
 *
 * @Desc: 新的需求：40以上的书籍打9折，其他打8折
 * <p>
 * 通过扩展NovelBook类来实现，对原有系统保持最小化的改变
 * @Author: thy
 * @CreateTime: 2020/3/9 4:23
 **/
public class DiscountNovelBook extends NovelBook {

    public DiscountNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    //覆写价格
    @Override
    public int getPrice() {
        //原价
        int originPrice = super.getPrice();
        int discountPrice = 0;
        if (originPrice > 4000) {
            discountPrice = originPrice * 90 / 100;
        } else {
            discountPrice = originPrice * 80 / 100;
        }
        return discountPrice;

    }
}
