package com.tianhy.designpattern.facecade;

/**
 * {@link}
 *
 * @Desc: 场景
 * @Author: thy
 * @CreateTime: 2020/3/5 5:44
 **/
public class Client {

    public static void main(String[] args) {

        //没有邮局
/*
        ILetterProcess process = new LetterProcessImpl();
        process.writeContext("in the wind");
        process.fillEnvelope("somewhere");
        process.letterIntoEnvelope();
        process.sendLetter();
*/

        //新增邮局
        PostOffice postOffice = new PostOffice();
        String context = "context";
        String address = "address";
        postOffice.sendLetter(context, address);

        //高层没有变动，不改变子系统对外暴露的接口、方法，只改动了内部逻辑，其他兄弟模块的调用
        //产生了不同的结果
    }
}
