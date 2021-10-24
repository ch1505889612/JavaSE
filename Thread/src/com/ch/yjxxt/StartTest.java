package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 15:12
 */
public class StartTest implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread();
         thread.getState(); //NEW
         thread.start();
         while (true){
             thread.getState();
             try {

             }catch (Exception e){
                 e.printStackTrace();
             }
             //当th线程终止,主线程结束
             if(Thread.State.TERMINATED.equals(thread.getState())){
                 System.out.println("结束了");
                 break;
             }
         }
    }

    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
