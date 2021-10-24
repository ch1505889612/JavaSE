package com.ch.yjxxt;

@SuppressWarnings({"all"})
public class JJc01 {
    public static void main(String[] args) {
                Person p1 = new Person("cc",12);
                Person p2 = new Person("xx",14);
                System.out.println(p1);
                System.out.println(p2);
    }
}
class Person{
    String name;
    int age;
    public Person(String name1,int age1){
        name = name1;
        age = age1;
    }


    public Person(String name1){
        name = name1;
    }


}
