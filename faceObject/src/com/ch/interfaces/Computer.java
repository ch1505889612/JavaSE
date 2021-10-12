package com.ch.interfaces;

/**
 * @author procedure sail
 * @date 2021/10/11 15:25
 * 电脑类
 */
public class Computer {

    String name;

    public Computer() {
    }

    public void open(){
        System.out.println("电脑开机了");
        Mouse mouse = new Mouse();
        mouse.USB(mouse);
        new KeyBoard().USB(new KeyBoard());
    }


}
