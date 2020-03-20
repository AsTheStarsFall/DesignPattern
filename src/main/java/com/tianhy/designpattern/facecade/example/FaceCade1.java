package com.tianhy.designpattern.facecade.example;

/**
 * {@link}
 *
 * @Desc: 第二个门面，只提供某个或某些子系统的接口，非全部
 * @Author: thy
 * @CreateTime: 2020/3/5 6:37
 **/

public class FaceCade1 {

    //引入原门面
    private FaceCade faceCade =new FaceCade();

    //只提供唯一的访问
    public void methodB(){
        faceCade.methodB();
    }

}
