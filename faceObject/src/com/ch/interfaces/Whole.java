package com.ch.interfaces;


/**
 * @author procedure sail
 * @date 2021/10/11 14:36
 *
 *  jdk1.7及之前的:
 *    1.常量:
 *       常量修饰符:final可以默认不写
 *    2.抽象方法:
 *       public在抽象方法中是默认的,可以省略不写
 *       在接口中的抽象方法这个修饰符:abstract可以省略不写
 *
 *  jdk.8及以后的版本新增的接口属性:
 *       1.可以在接口中写static修饰符
 *       2.可以使用default的修饰符
 */
public interface Whole {

    /**
     * 常量
     */
     boolean FLAG=true;

    /**
     * 抽象方法
     */
    abstract void del();




    /**
     * 被static修饰的方法,只能被接口调用
     */
     static void add(){
         System.out.println("被static修饰的抽象方法");
    }


    /**
     * 被default修饰的抽象方法,实现类可以重写这个方法
     */
    default void list(){
        System.out.println("被default修饰的抽象方法");
    }
}
