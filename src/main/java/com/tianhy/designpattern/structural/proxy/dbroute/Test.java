package com.tianhy.designpattern.structural.proxy.dbroute;


/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/15
 **/
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(System.currentTimeMillis());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
