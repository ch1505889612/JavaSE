package com.ch.object.onoctober12;

public class Class003_OuterTest {
    int i=1;

    class Inner{
        int i=2;
        public void inner(){
            int i=3;
            //在此调用局部变量i=3
            System.out.println(i);
            //在此调用内部类成员变量i=2
            System.out.println(this.i);
            //在此调用外部类成员变量i=1
            System.out.println(new Class003_OuterTest().i);
        }
    }


    public static void main(String[] args) {
        Inner inner = new Class003_OuterTest().new Inner();
        inner.inner();
    }
}