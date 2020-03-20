package com.tianhy.designprinciple.isolation;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 6:30
 **/
public abstract class AbstractSearcher {

//    protected IPrettyGirl pettyGirl;
    protected IGoodBody goodBody;
    protected IGreateTemperament greateTemperament;

//    public AbstractSearcher(IPrettyGirl pettyGirl) {
//        this.pettyGirl = pettyGirl;
//    }

    public AbstractSearcher(IGoodBody goodBody) {
        this.goodBody = goodBody;
    }

    public AbstractSearcher(IGreateTemperament greateTemperament) {
        this.greateTemperament = greateTemperament;
    }

    public abstract void show();
}
