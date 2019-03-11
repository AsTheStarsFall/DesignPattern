package com.tianhy.designpattern.singleton.register;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/12
 **/
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
