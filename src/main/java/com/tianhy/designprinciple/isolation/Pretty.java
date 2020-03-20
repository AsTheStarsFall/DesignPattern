package com.tianhy.designprinciple.isolation;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 6:42
 **/
public class Pretty implements IGreateTemperament, IGoodBody {

    private String name;

    public Pretty(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + " is goodLooking");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + " is niceFigure");

    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + " is greatTemperament");

    }

}
