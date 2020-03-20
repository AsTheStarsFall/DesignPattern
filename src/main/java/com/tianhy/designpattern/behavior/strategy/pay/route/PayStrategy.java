package com.tianhy.designpattern.behavior.strategy.pay.route;

import com.tianhy.designpattern.behavior.strategy.pay.Payment;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc: 支付策略
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class PayStrategy {
    public static final String ALI_PAY = "aliPay";
    public static final String JD_PAY = "jdPay";
    public static final String UNION_PAY = "unionPay";
    public static final String WX_PAY = "wxPay";

    private static final Payment DEFAULT_PAY = new AliPay();

    private static Map<String,Payment> payment = new HashMap<>();

    static {
        payment.put(ALI_PAY,new AliPay());
        payment.put(JD_PAY,new JDPay());
        payment.put(WX_PAY,new WxPay());
        payment.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String payType){
        if(!payment.containsKey(payType)){
            return DEFAULT_PAY;
        }
        return payment.get(payType);
    }

}
