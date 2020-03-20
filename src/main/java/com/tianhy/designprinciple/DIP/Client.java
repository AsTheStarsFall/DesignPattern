package com.tianhy.designprinciple.DIP;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 5:17
 **/
public class Client {
    public static void main(String[] args) {
        ICar car = new R8();
        IDriver driver = new Driver(car);

        driver.driver(car);
    }
}
