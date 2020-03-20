package com.tianhy.designprinciple.LOD;

import java.util.List;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 7:40
 **/
public class GroupLeader {
    /*
        public void countGirls(List<Girl> girls) {
            System.out.println("size :" + girls.size());
        }
    */
    private List<Girl> list;

    public GroupLeader(List<Girl> list) {
        this.list = list;
    }

    public void countGirls() {
        System.out.println("size :" + this.list.size());
    }

}
