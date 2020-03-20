package com.tianhy.designpattern.behavior.strategy.pay;

/**
 * @Desc: 支付逻辑
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public abstract class Payment {

    public abstract String payType();
    protected abstract double queryBalance(String uid);


    //扣款支付
    public PayState pay(String uid,double amount){
        if(queryBalance(uid) < amount){
            return new PayState(500,"支付失败!","余额不足！");
        }
        return new PayState(200,"支付成功!","支付金额:"+ amount);
    }
}
