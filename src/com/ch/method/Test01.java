package com.ch.method;

import java.util.Scanner;



/**
 * @author procedure sail
 * @date 2021/9/29 17:08
 *
 * 问题:输入一个数,返回值是倒序这个数
 *   1.声明一个变量接收用户输入的值
 *   2.声明一个变量去计算用户输入的值长度
 *   3.不合法的数返回-1
 *
 */
public class Test01 {

    public static void main(String[] args) {
        int num = test01();

        int reverse=reverse(10,num);
        System.out.println(reverse);

    }

    public static int reverse(int n,int num) {
         //1.用一个变量存储用户输入的数的长度
        int length = length(num);
        //2.定义一个变量存储倒序的数
        int sum=0;


        while (num!=0){
            int temp=1;
            //3.定义变量存储取余的值
            int mod=num%10;
            for (int i = 1; i <=length-1 ; i++) {
               temp*=n;
            }
             sum+=temp*mod;
            length--;
            num=num/10;
        }
        return sum;
    }

    /**
     * 获取用户输入的数是几位数
     * @param num 用户输入的值
     * @return 返回输入的数的长度
     */
    public static int length(int num){
        //1.设置一个变量存储用户输入数的长度
        int length=0;
        while (num!=0){
            num=num/10;
            length++;
        }
        return length;
    }



    /**
     *  获取用户输入的值
     * @return 用户输入的值
     */
    public static int test01(){
        System.out.println("请输入一个数");
        //1.获取用户输入的值
        Scanner scanner = new Scanner(System.in);
        //2.用一个变量去接收用户输入的值,默认-1是为了返回不合法的值
        int nextInt = -1;

        //3.判断用户输入的值是否合法
        if (scanner.hasNextInt()){
             nextInt=scanner.nextInt();
             return nextInt;
        }else {
            System.out.println("该用户不合法");
        }

        return nextInt;
    }


}
