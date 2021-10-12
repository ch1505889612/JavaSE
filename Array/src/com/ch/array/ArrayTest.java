package com.ch.array;

import java.util.Arrays;

/**
 * @author procedure sail
 * @date 2021/10/12 16:04
 *
 * 变量:存储单个值
 * 数组:存储一个或多个值
 *    数组的两种初始化
 *      1.静态初始化
 *         数据类型[] 变量名=new 数据类型[]{}
 *         数据类型[] 变量名={}   字面量
 *      2.动态初始化
 *         数据类型[] 变量名=new 数据类型[数据个数]
 *
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] arrs;
        String[] name;
        Employee[] employees;


        //静态数组初始化赋值(一)
        arrs=new int[]{1,2,3};
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);

        //数组的长度:length
        System.out.println("arrs的长度"+arrs.length);

        //静态数组初始化二
        char[] type={'a','b','c'};
        System.out.println(Arrays.toString(type));


        //动态初始化数组
        employees=new Employee[3];
        employees[1]=new Employee();
        System.out.println(Arrays.toString(employees));
    }
}

class Employee{
}
