package com.tianhy.designpattern.facecade;

/**
 * {@link}
 *
 * @Desc: 定义写信流程接口
 * @Author: thy
 * @CreateTime: 2020/3/5 5:41
 **/
public interface ILetterProcess {

    void writeContext(String context);
    void fillEnvelope(String address);
    void letterIntoEnvelope();
    void sendLetter();

}
