package com.tianhy.designprinciple.LOD.install;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 7:54
 **/
public class InstallSoftware {

    //Wizard暴露过多方法
/*
    public void installSoftware(Wizard wizard) {
        int first = wizard.first();
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }
*/

    public void installSoftware(Wizard wizard) {
        wizard.installWizard();
    }
}
