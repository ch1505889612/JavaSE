package com.ch.object.onoctober12;

/**
 * @author procedure sail
 * @date 2021/10/12 10:31
 */
public class MemberInterior {


    private int a=0;

    public String name="您好";

    static int price=12;

    public void adds(){
        System.out.println("外部类方法");
    }

    public class Inter{

        private int a=0;

        //普通的内部类,不允许存在静态内容
        //public static int num=0;

        //        public static void add(){
        //            System.out.println("来来来");
        //        }


        //可以存在静态常量
        public static final int num=0;

        public void add(){
            System.out.println("内部类方法");
            //内部类成员变量a
            System.out.println(a);
            //测试调用外部类属性
            System.out.println(name);
            //外部类私有属性
            System.out.println(MemberInterior.this.a);
            //外部类静态属性
            System.out.println(price);
            //外部类方法
            adds();
        }

    }


}
