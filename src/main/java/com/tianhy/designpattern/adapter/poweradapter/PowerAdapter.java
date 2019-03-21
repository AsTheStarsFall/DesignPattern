package com.tianhy.designpattern.adapter.poweradapter;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PowerAdapter implements DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int ac = ac220.outputAC220v();
        int dc =ac/44;
        System.out.println("input "+ ac+",output "+dc);
        return dc;
    }
}
