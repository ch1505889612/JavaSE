package com.ch.object.tentenwork.It;

/**
 * @author procedure sail
 * @date 2021/10/10 21:25
 */
public class Test {

    public static void main(String[] args) {
        IT it = new IT("FireStar",21,"大数据工程师",2);
        System.out.println("姓名"+it.getName());
        System.out.println("年龄"+it.getAge());
        it.work("yjxxt","学习组成员");
    }
}
