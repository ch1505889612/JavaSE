package com.ch.object.onoctober11.test;

import com.ch.object.onoctober11.Bacon;
import com.ch.object.onoctober11.Coffee;
import com.ch.object.onoctober11.MineralWater;
import com.ch.object.onoctober11.Seafood;

import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/11 20:23
 */
public class Test02 {

    public static void main(String[] args) {
        System.out.println("请选择你饮料(1.咖啡 2.矿泉水 3.可乐)");
        Scanner s=new Scanner(System.in);
        int nextInt = s.nextInt();
        if (nextInt==1){
            System.out.print("请输入购买容量:");
            int number = s.nextInt();
            System.out.print("请问是否要配料:(1、加糖 2、加奶 3、什么都不加)");
            int info = s.nextInt();
            Coffee coffee=null;
            MineralWater mineralWater=null;
            if (info ==1){
                coffee=new Coffee("咖啡",number,"加糖");
            }else if (info==2){
                coffee=new Coffee("咖啡",number,"加奶");
            } else if (info==3){
                coffee=new Coffee("咖啡",number,"什么都不加");
            }
          coffee.show();
        }else if (nextInt==2){
              
        }else if (nextInt==3){

        }
    }
}
