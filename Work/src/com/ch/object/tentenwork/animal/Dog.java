package com.ch.object.tentenwork.animal;

import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/10 20:51
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String mood="开心";

    public Dog() {
    }

    public Dog(String name, String breed, int age, String mood) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        if (mood==this.mood||mood.equals("伤心")){
            this.mood=mood;
        }else {
            System.out.println("无效输入,请重新输入心情");
        }
    }

    public void cry(){
        System.out.println("名字叫"+name+"的"+breed+"吃完饭正在"+mood+"叫着");
    }

    public void run(){
        System.out.println(age+"岁的"+name+"的"+",他正在"+mood+"的想念被偷的骨头");
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        if (mood==this.mood||mood.equals("伤心")){
            this.mood=mood;
        }else {
            System.out.println("无效输入,请重新输入开心或者伤心");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed) &&
                Objects.equals(mood, dog.mood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, mood);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                '}';
    }
}
