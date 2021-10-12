package com.ch.array;

/**
 * @author procedure sail
 * @date 2021/10/12 17:14
 *
 * //A:遍历User类型的数组 依次输出每个数组元素
 *
 * //C:最值:获取数组中的最大值和最小值
 * //D:逆序:倒叙输出数组元素
 */
public class User {
    private String name;
    private int age;
    private String password;

    public User() {
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
