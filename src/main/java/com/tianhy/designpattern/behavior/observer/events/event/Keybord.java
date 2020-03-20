package com.tianhy.designpattern.behavior.observer.events.event;


import com.tianhy.designpattern.behavior.observer.events.core.EventLisenter;

/**
 * 键盘
 */
public class Keybord extends EventLisenter {

    public void down() {
        System.out.println("调用↓方向键");
        super.trigger(KeybordEventType.ON_DOWN);
    }

    public void up() {
        System.out.println("调用↑方向键");
        super.trigger(KeybordEventType.ON_UP);
    }

}
