package com.tianhy.designpattern.behavior.observer.events;

import com.tianhy.designpattern.behavior.observer.events.event.*;

public class EventsTest {
    public static void main(String[] args) {
        keybord();

    }

    public static void keybord() {
        KeybordEventCallback keybordEventCallback = new KeybordEventCallback();
        Keybord keybord = new Keybord();

        keybord.addLisenter(KeybordEventType.ON_UP, keybordEventCallback);

        keybord.down();

    }

    public static void mouse() {
        MouseEventCallback callback = new MouseEventCallback();
        Mouse mouse = new Mouse();
        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
//        mouse.addLisenter(MouseEventType.ON_CLICK,callback1);
//        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);
        mouse.click();
//        mouse.focus();
    }
}
