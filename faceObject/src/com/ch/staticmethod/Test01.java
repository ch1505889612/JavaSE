package com.ch.staticmethod;

/**
 * @author procedure sail
 * @date 2021/10/8 14:55
 *
 *    静态块>main()方法>局部块>构造块
 */

public class Test01 {



    public static int a;

    public int n;


    //构造块
    {
        System.out.println("构造块1");
    }
    {
        System.out.println("构造块2");
    }
    {
        System.out.println("构造块3");
    }

    //静态块
    static {
        System.out.println("我是静态块,我在类加载第一次时候,只执行一次");
    }
    static {
        System.out.println("我是静态块2");
    }
    static {
        System.out.println("我是静态块3");
    }





}
