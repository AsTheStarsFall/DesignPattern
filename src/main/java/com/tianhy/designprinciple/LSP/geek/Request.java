package com.tianhy.designprinciple.LSP.geek;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:12
 * @Desc:
 */
public class Request {

    private String string;
    private Long id;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
