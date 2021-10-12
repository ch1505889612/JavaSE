package com.ch.interfaces;

/**
 * @author procedure sail
 * @date 2021/10/11 14:41
 */
public class WholeImpl implements Whole{

    @Override
    public void del() {
        System.out.println("这是个删除方法");
    }

    @Override
    public void list() {
        System.out.println("我重写了Whole接口的list方法");
    }
}
