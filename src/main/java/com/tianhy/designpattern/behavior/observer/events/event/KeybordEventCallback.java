package com.tianhy.designpattern.behavior.observer.events.event;

import com.tianhy.designpattern.behavior.observer.events.core.Event;

/**
 * @Author: thy
 * @Date: 2020/2/17 15:39
 * @Desc: 键盘事件回调
 */
public class KeybordEventCallback {
    public void onUp(Event e) {
        System.out.println("===========触发键盘↑事件==========" + "\n" + e);

    }

    public void onDown(Event e) {
        System.out.println("===========触发键盘↓事件==========" + "\n" + e);
    }
}
