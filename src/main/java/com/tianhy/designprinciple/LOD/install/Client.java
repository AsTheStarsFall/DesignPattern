package com.tianhy.designprinciple.LOD.install;

/**
 * {@link}
 *
 * @Desc: 迪米特/最少知道原则
 * @Author: thy
 * @CreateTime: 2020/3/12 7:55
 **/
public class Client {
    public static void main(String[] args) {
        InstallSoftware software = new InstallSoftware();
        software.installSoftware(new Wizard());
    }
}
