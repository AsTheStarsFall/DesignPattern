package com.tianhy.designpattern.facecade;

/**
 * {@link}
 *
 * @Desc: 在原有写信的流程的扩展。检查功能
 * @Author: thy
 * @CreateTime: 2020/3/5 5:55
 **/
public class Check {

    public void checkLetter(ILetterProcess process) {
        if (process != null) {
            System.out.println("Checked :" + process);
        }
    }
}
