package com.tianhy.designpattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @Desc: 约束ORM逻辑的接口
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum)throws Exception;
}
