package com.ch.object.tentenwork.It;

import java.util.HashMap;

/**
 * @author procedure sail
 * @date 2021/10/11 9:30
 */
public class Test01 {


    public static void main(String[] args) {

        //向上类型转换
       Person p= new Student();

       //向下类型转换
        Student s= (Student) p;
        Brother b=(Brother) p;
        //报错的异常为java.lang.ClassCastException,意思是类型转换错误
       //  Brother b=(Brother) p;
        //instanceof:
        if ( p instanceof Student){
            s.test();
        }else if (p instanceof Brother){
            b.test();
        }

    }
}


class Person{

}

class Student extends Person{
    void test(){
        System.out.println("student");
    }
}

class Brother extends Person{
    void test(){
        System.out.println("brother");
    }
}
