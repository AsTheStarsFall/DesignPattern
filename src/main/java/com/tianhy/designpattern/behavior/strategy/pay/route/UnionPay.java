package com.tianhy.designpattern.behavior.strategy.pay.route;

import com.tianhy.designpattern.behavior.strategy.pay.Payment;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class UnionPay extends Payment {
    @Override
    public String payType() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
