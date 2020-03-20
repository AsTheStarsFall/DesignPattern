package com.tianhy.designprinciple.LOD;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 7:42
 **/
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        List<Girl> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add(new Girl());
        }
        teacher.commond(new GroupLeader(list));
    }
}
