package com.ch.staticmethod;

public class Class002_BlockTest {

    public static int a = 0;

    {
        a = 10;
        System.out.println(" 3 、非静态代码块执行a=" + a); //a=10
    }

    static {
        a = 6;
        System.out.println(" 1、静态代码块执行a=" + a); //a=6
    }

    public Class002_BlockTest() {
        this(a); //===>有参构造:Class002_BlockTest(int n)
        System.out.println(" 6、" + a);  //a=10
        System.out.println("7、无参构造方法执行a=" + a); // a=10
    }

    public Class002_BlockTest(int n) {
        System.out.println("4 、" + n); // n=6
        System.out.println("5 、" + a);// a=10
    }

    public static void main(String[] args) {
        System.out.println("2 、main");
        Class002_BlockTest tsc = new Class002_BlockTest();
        System.out.println(Test01.a);
    }
}

