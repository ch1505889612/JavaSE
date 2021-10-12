package com.ch.object.onoctober12.lambda;

/**
 * @author procedure sail
 * @date 2021/10/12 15:04
 */
public class Java8Testers {

    public static void main(String[] args) {
        //lambda表达式一:
        Java8Tester java8Tester=(a,b)->{return a+b;};

        //lambda表达式二:
        java8Tester=(a,b)->a+b;

        System.out.println(java8Tester.add(1,2));
    }


}

@FunctionalInterface
interface Java8Tester{
      int add(int a,int b);
}
