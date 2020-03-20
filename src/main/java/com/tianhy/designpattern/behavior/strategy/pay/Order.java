package com.tianhy.designpattern.behavior.strategy.pay;

import com.tianhy.designpattern.behavior.strategy.pay.route.PayStrategy;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class Order {
    private String uid;
    private String oid;
    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public PayState pay(String payType){
        Payment payment = PayStrategy.get(payType);
        System.out.println("欢迎使用"+ payment.payType());
        System.out.println("本次交易额为:"+ amount +",  开始扣款...");
        return payment.pay(uid,amount);
    }
}
