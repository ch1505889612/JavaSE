package com.ch.interfaces;

/**
 * @author procedure sail
 * @date 2021/10/11 15:28
 * 键盘类
 */
public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("键盘开始了");
    }

    @Override
    public void close() {
        System.out.println("键盘结束了");
    }

    @Override
    public void USB(USB usb) {
        usb.open();
        usb.close();
    }
}
