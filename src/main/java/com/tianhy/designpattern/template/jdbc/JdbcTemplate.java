package com.tianhy.designpattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 封装所有处理流程的抽象类
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public abstract class JdbcTemplate {

    //数据源
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 以查询为例，每次查询的表不同，返回的数据结构也就不一样。针对不同的数据，都要封装成不同的实体对象。
     * 而每个实体封装的逻辑都是不一样的，但封装前和封装后的处理流程是不变的，
     * 因此，可以使用模板方法模式来设计这样的业务场景。
     */
    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) throws Exception {

        //1、获取连接
        Connection conn = this.getConnection();
        //2、创建语句集
        PreparedStatement pstm = this.createPreparedStaement(conn, sql);
        //3、执行语句集
        ResultSet rs = this.executeQuery(pstm, values);
        //4、处理结果集
        List<?> result = this.parseResult(rs, rowMapper);
        //5、关闭结果集
        this.closeResultSet(rs);
        //6、关闭语句集
        this.closeStatement(pstm);
        //7、关闭连接
        this.closeConnection(conn);
        return result;
    }

    protected void closeConnection(Connection conn) throws Exception {
        conn.close();
    }

    protected void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    protected void closeResultSet(ResultSet rs) throws Exception {
        rs.close();
    }

    protected List<?> parseResult(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    protected PreparedStatement createPreparedStaement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }


    public Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }

}






