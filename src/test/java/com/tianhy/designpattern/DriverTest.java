package com.tianhy.designpattern;

import com.tianhy.designprinciple.DIP.*;
import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 5:24
 **/
public class DriverTest extends TestCase {

    Mockery context = new JUnit4Mockery();


    public void testDriver() {
        //根据抽象虚拟一个对象
        final ICar car = context.mock(ICar.class);

        IDriver driver = new Driver();
        context.checking(new Expectations() {
            {
                oneOf(car).run();
            }
        });

        driver.driver(car);
    }

}
