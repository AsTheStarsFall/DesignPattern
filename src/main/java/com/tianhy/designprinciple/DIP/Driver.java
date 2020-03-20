package com.tianhy.designprinciple.DIP;

/**
 * {@link}
 *
 * @Desc: 司机实现类
 * @Author: thy
 * @CreateTime: 2020/3/12 5:15
 **/
public class Driver implements IDriver {

    //构造函数传递依赖对象
    private ICar car;

    public Driver(ICar car) {
        this.car = car;
    }

    @Override
    public void setCar(ICar car) {
        this.car = car;
    }

    @Override
    public void driver(ICar car) {
        this.car.run();
    }
}
