package com.tianhy.designprinciple.LSP.geek;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:09
 * @Desc: 继续原生类，进行扩展
 */
public class FuncExtends extends Original {
    //在子类中增强功能
    private String f1;
    private Long f2;

    public FuncExtends(Func func, String f1, Long f2) {
        super(func);
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public String func(Request request) {
        request.setString(f1);
        request.setId(f2);
        return super.func(request);
    }
}
