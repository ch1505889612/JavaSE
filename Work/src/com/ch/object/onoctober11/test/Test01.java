package com.ch.object.onoctober11.test;

import com.ch.object.onoctober11.Bacon;
import com.ch.object.onoctober11.Seafood;

import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/11 19:50
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println("请选择你需要制作的披萨\n\t\t 1.培根披萨\n\t\t 2.海鲜披萨");
        Scanner s=new Scanner(System.in);
        int nextInt = s.nextInt();
        if (nextInt==1){
            System.out.print("请输入培根数:");
            int number = s.nextInt();
            System.out.print("请输入披萨价格:");
            double price = s.nextDouble();
            System.out.print("请输入披萨大小:");
            int size = s.nextInt();
            Bacon bacon = new Bacon("培根披萨", price, size,12);
            bacon.show();
        }else if (nextInt==2){
            System.out.print("请输入海鲜配料:");
            String info = s.next();
            System.out.print("请输入披萨价格:");
            double price = s.nextDouble();
            System.out.print("请输入披萨大小:");
            int size = s.nextInt();
            Seafood seafood = new Seafood("海鲜披萨",price,size,info);
            seafood.show();
        }
    }
}
