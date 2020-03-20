package com.tianhy.designprinciple.isolation;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 6:45
 **/
public class Client {

    public static void main(String[] args) {
//        IPrettyGirl girl = new Pretty("pretty");

        IGoodBody goodBody = new Pretty("pretty");

        AbstractSearcher searcher = new Searcher(goodBody);

        searcher.show();
    }
}
