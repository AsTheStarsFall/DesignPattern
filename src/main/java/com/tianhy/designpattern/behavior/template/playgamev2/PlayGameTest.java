package com.tianhy.designpattern.behavior.template.playgamev2;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PlayGameTest {

    public static void main(String[] args) {
        System.out.println("poor man play game...");
        Game poorPlayer = new PoorGamePlayer();
        poorPlayer.playLol();

        System.out.println("rich man play game...");
        Game richPlayer = new RichGamePlayer(true);
        richPlayer.playLol();
    }
}
