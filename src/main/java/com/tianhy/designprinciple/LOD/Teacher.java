package com.tianhy.designprinciple.LOD;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 7:39
 **/
public class Teacher {

    public void commond(GroupLeader leader) {
/*
        List<Girl> list = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            list.add(new Girl());
        }
        leader.countGirls(list);
*/
        //最少知道原则，这个类的直接朋友类只有GroupLeader
        leader.countGirls();
    }
}
