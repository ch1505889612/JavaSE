package com.ch.interfaces;

/**
 * @author procedure sail
 * @date 2021/10/11 15:27
 * 鼠标类
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开始了");
    }

    @Override
    public void close() {
        System.out.println("鼠标弹出了");
    }

    @Override
    public void USB(USB usb) {
      usb.open();
      usb.close();
    }
}
