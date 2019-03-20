package com.tianhy.designpattern.strategy.pay;

import com.tianhy.designpattern.strategy.pay.route.PayStrategy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class PayStrategyTest {
    public static void main(String[] args) {

        Order order = new Order("1","2019320000000",900.52);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
