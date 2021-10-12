package com.yjjxt.ch;

/**
 * @author procedure sail
 * @date 2021/10/16 10:41
 */
public class TestStringMethod {

    public static void main(String[] args) {

        char[] ch1={'a','b','f','2'};
        //返回 char指定索引处的值。
        String str=new String(ch1);
        System.out.println(str.charAt(1));

    }
}

