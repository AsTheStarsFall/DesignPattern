package com.tianhy.designpattern.proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc: 动态切换数据源静态代理类
 * @Author: thy
 * @CreateTime: 2019/3/15
 **/
public class OrderServiceStaticProxy implements IOrderService{

    //年份格式化，只要年
    private SimpleDateFormat yearFomat = new SimpleDateFormat("yyyy");
    private IOrderService iOrderService;

    public OrderServiceStaticProxy(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer route = Integer.valueOf(yearFomat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_"+ route+"】数据源");
        DynamicDataSourceEntry.set(route);
        iOrderService.createOrder(order);
        after();
        return 0;
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("start proxy");
    }
}
