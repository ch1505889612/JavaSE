package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 14:33
 *
 */
public class InterPutTest implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            if (Thread.interrupted()){
                System.out.println("程序执行中断,复位后为"+Thread.interrupted());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new InterPutTest());
        th.start();
//        System.out.println(th.isInterrupted()+"");
        th.interrupt();//程序中断
        System.out.println(th.isInterrupted()+",,,,,,");
    }
}



