package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 10:50
 */
public class CountTest implements Runnable {
    public static void main(String[] args) {
        new Thread(new CountTest()).start();
    }

    @Override
    public void run() {
        for (int i = 10; i >=0 ; i--) {
            try {
                System.out.println("倒计时"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
