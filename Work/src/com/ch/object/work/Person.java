package com.ch.object.work;

/**
 * @author procedure sail
 * @date 2021/10/8 19:52
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名:"+name+",年龄"+age);
    }

    public static void main(String[] args) {
        Person zmy = new Person("zmy", 19);
        zmy.display();
    }
}
