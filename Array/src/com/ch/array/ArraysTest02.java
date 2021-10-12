package com.ch.array;

import java.util.Arrays;

/**
 * @author procedure sail
 * @date 2021/10/12 16:44
 */
public class ArraysTest02 {

    public static void main(String[] args) {
        //用普通for循环跟增强for循环分别为一个长度为5的数组赋值,赋的值依次为101,102...

        //声明一个长度为5的数组
        int[] arrs=new int[5];
        //声明一个变量存储要赋的值
        int a=101;
        for (int i = 0; i <arrs.length ; i++) {
             arrs[i]=a++;
        }
        System.out.println(Arrays.toString(arrs));


        int b=101;
        int count=0;
        for (int i:arrs){
            arrs[count]=b;
            b++;
            count++;
        }

        System.out.println(Arrays.toString(arrs));
    }
}
