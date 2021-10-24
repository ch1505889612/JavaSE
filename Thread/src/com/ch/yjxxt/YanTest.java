package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 11:44
 */
public class YanTest {
    public static void main(String[] args) {
     new Thread(  new Father()).start();
    }
}

class Father implements Runnable{

    @Override
    public void run() {
        System.out.println("我想抽烟了");
        System.out.println("你快点去买");

        Thread thread = new Thread(new Son());
        thread.start();

        System.out.println("快快给我");

    }
}
class Son implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            try {
                System.out.println("时间过去了"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("买完了");
    }
}
