package com.ch.array.test;

import com.ch.array.User;

/**
 * @author procedure sail
 * @date 2021/10/12 17:15
 */
public class Test01 {

    public static void main(String[] args) {
        User user1 = new User("张三", 18, "123456");
        User[] users=new User[]{
                user1 ,
                new User("李四",20,"123456"),
                new User("王五",21,"123456"),
                new User("赵六",23,"1234506"),
                new User("重七",18,"123456"),
        };

        for(User user:users){
            System.out.println(user);
        }

    }
}
