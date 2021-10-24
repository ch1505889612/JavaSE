package com.ch.yjxxt;

import java.util.ArrayList;

/**
 * @author procedure sail
 * @date 2021/10/21 17:39
 */
public class RunnableTest implements Runnable {

    public static void main(String[] args) {
        //1.创建线程对象
        Thread thread = new Thread(new RunnableTest());
        //2.开启线程
        thread.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("走你");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

       
    }

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("我在起飞");

        }
    }
}
