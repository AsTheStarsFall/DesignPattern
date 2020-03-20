package com.tianhy.designpattern.facecade;

/**
 * {@link}
 *
 * @Desc: 邮局，对整个写信到寄信的流程进行封装
 * @Author: thy
 * @CreateTime: 2020/3/5 5:50
 **/
public class PostOffice {

    private ILetterProcess process = new LetterProcessImpl();

    //引入检查机制
    Check check = new Check();


    public void sendLetter(String context, String address) {
        process.writeContext(context);
        process.fillEnvelope(address);
        process.letterIntoEnvelope();
        //发送前进行检查
        check.checkLetter(process);

        process.sendLetter();
    }

}
