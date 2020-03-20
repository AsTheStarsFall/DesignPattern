package com.tianhy.designpattern.creatation.prototype.simple;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class Client {

   // private Prototype prototype;

    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}
