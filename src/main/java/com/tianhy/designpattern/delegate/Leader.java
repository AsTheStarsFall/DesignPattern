package com.tianhy.designpattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc: 委派模式: 领导-->项目经理-->程序员
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class Leader {
    //通过获得Boss的命令来分发任务
    private Map<String,Employ> targets = new HashMap<>();
    private String a = "游戏开发";
    private String b = "商城开发";

    public Leader() {
        targets.put("游戏",new EmployeeA());
        targets.put("商城",new EmployeeB());
    }

    public void dispatcher(String command){
        switch (command){
            case "游戏":
                targets.get(command).doingWork(a);
                break;
            case "商城":
                targets.get(command).doingWork(b);
                break;
                default:
                    System.out.println("没有能够执行这个任务的人");
                    break;
        }
    }
}
