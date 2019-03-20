package com.tianhy.designpattern.strategy.pay.route;

import com.tianhy.designpattern.strategy.pay.Payment;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class AliPay extends Payment {
    @Override
    public String payType() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
