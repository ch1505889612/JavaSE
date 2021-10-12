package com.yjjxt.ch;

/**
 * @author procedure sail
 * @date 2021/10/16 15:24
 */
public class TestEnum {
    public static void main(String[] args) {
        WeekDay weekDay=WeekDay.DAY1;
        //获取实例对象名字
        System.out.println(weekDay);
        //获取实例对象名字的值
        System.out.println(weekDay.getDays());
        weekDay.values();
    }
}
