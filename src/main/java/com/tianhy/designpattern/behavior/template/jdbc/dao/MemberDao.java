package com.tianhy.designpattern.behavior.template.jdbc.dao;

import com.tianhy.designpattern.behavior.template.jdbc.JdbcTemplate;
import com.tianhy.designpattern.behavior.template.jdbc.RowMapper;
import com.tianhy.designpattern.behavior.template.jdbc.pojo.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() throws Exception {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("user_name"));
                return member;
            }
        }, null);
    }
}
