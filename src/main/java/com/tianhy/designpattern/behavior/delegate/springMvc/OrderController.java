package com.tianhy.designpattern.behavior.delegate.springMvc;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class OrderController {
    public void getOrderById(String oid){
        System.out.println("orderId:"+oid);
    }
}
