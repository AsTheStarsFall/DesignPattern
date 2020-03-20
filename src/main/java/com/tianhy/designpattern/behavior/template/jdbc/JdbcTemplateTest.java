package com.tianhy.designpattern.behavior.template.jdbc;

import com.tianhy.designpattern.behavior.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class JdbcTemplateTest {

    public static void main(String[] args) throws Exception {
        MemberDao dao = new MemberDao(null);
        List<?> results = dao.selectAll();
        System.out.println(results);
    }
}
