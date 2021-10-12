package com.ch.interfaces;

/**
 * @author procedure sail
 * @date 2021/10/11 15:22
 */
public interface USB {
    /**
     * 使用
     */
    void open();

    /**
     * 关闭
     */
    void close();

    /**
     * 判断是USB接口设备
     * @param usb
     */
    void USB(USB usb);
}
