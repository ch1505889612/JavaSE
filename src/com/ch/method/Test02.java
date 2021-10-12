package com.ch.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author procedure sail
 * @date 2021/9/29 20:44
 *
 *    计算斐波那契数列中第22、45、50项的值
 *   斐波那契数列:1,1,2,3,5,7......
 *   公式: f(n)=f(n-1)+f(n-2)
 *   组成:头部分:第一项为1,第二项为1,第三项开始就是前两项的和
 *       +停止条件
 */
public class Test02 {



    public static void main(String[] args) {
//        List<Long> list = feBo01(50);
//        for (Long num:list){
//            System.out.println(num);
//        }
         //list.forEach(a->System.out.println(a));
         feBo02(50);
    }

    /**
     * 普通方法for循环求斐波那契数列
     * @param num 需要算的那项,也可以说停止条件
     */
    public static List<Long> feBo01(int num){
        List<Long> list = new ArrayList<>();
        //1.当求的是第一项或者第二项是直接返回结果
       if (num==1||num==2){
           list.add(1L);
           return list;
       }
       /*
         num1:前两项的值
         num2:前一项的值
         num3:当前项的值
        */

        long num1=1, num2=1, num3=0;
        for (int i = 3; i <=num ; i++) {
           num3=num1+num2;
           if (i==22||i==45||i==50){
               list.add(num3);
            }
           num1=num2;
           num2=num3;
        }
      return list;
    }


    /**
     * 使用递归
     * @return
     */
    public static Long feBo02(int num){
        if (num==1||num==2){
            return 1L;
        }
        return feBo02(num-1)+feBo02(num-2);
    }
}
