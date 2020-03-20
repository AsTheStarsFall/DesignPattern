package com.tianhy.designprinciple.DIP;

/**
 * {@link}
 *
 * @Desc: 司机接口
 * @Author: thy
 * @CreateTime: 2020/3/12 5:14
 **/
public interface IDriver {

    //setter依赖注入
    public void setCar(ICar car);

    //通过传入汽车接口实现了抽象之间的依赖关系
    public void driver(ICar car);
}
