package com.tianhy.designpattern.structural.proxy.dbroute;


/**
 * 持久层操作类
 */
public class OrderDao {

    public int create(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
