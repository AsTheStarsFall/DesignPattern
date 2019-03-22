package com.tianhy.designpattern.singleton.register;

/**
 * @Desc:枚举式单例在静态代码块中就给INSTANCE进行了赋值，是饿汉式单例的实现。
 * @Author: thy
 * @CreateTime: 2019/3/12
 **/
public enum  EnumSingleton {
    /**
     *
     */
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
