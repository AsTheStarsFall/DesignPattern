package com.tianhy.designprinciple.openclose;

/**
 * {@link}
 *
 * @Desc: 新增计算机书籍接口
 * @Author: thy
 * @CreateTime: 2020/3/9 5:08
 **/
public interface IComputerBook extends IBook {
    //计算机书籍的范围
    public String getScope();
}
