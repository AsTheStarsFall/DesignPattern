package com.tianhy.designprinciple.LSP.geek;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:08
 * @Desc: 原生类
 */
public class Original {

    private Func func;

    public Original(Func func) {
        this.func = func;
    }

    public String func(Request request) {
        return request.toString();
    }
}
