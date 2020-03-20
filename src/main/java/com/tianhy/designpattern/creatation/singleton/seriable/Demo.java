package com.tianhy.designpattern.creatation.singleton.seriable;

import java.io.*;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/4/2
 **/
public class Demo {


    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("Test.text");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
    }

}
