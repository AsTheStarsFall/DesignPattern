package com.tianhy.designpattern.facecade;

/**
 * {@link}
 *
 * @Desc: 写信接口实现类
 * @Author: thy
 * @CreateTime: 2020/3/5 5:43
 **/
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("信的内容：" + context);

    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址:" + address);

    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("将信封放入邮箱");

    }

    @Override
    public void sendLetter() {
        System.out.println("寄信");
    }
}
