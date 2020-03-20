package com.tianhy.designpattern.structural.proxy.dbroute;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService() {
        //每次实例化执行，拿到orderDao的引用
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        return orderDao.create(order);
    }
}
