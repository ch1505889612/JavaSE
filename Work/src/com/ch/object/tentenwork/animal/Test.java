package com.ch.object.tentenwork.animal;

/**
 * @author procedure sail
 * @date 2021/10/10 20:57
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("PACK", "田园犬", 4, "开心");
        dog.cry();
        Dog dog1 = new Dog();
        dog1.setAge(1);
        dog1.setName("小黑");
        dog1.setBreed("狼狗");
        dog1.setMood("伤心");
        dog1.run();
        Dog dog2 = new Dog("PACK", "田园犬", 4, "不开心");
    }
}
