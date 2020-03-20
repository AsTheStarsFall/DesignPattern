package com.tianhy.designpattern.behavior.template.jdbc;

import java.sql.ResultSet;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/4/10
 **/
public class Test {

    public static void main(String[] args) {
        demo de= new demo();
        de.test(new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                return null;
            }
        });

    }
}
