package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 16:50
 */
public class Web120306 implements Runnable{

    private int ticket=100;

    public static void main(String[] args) {
        Web120306 web120306 = new Web120306();
        Thread th1 = new Thread(web120306,"张三");
        Thread th2 = new Thread(web120306,"李四");
        Thread th3 = new Thread(web120306,"王五");

        th1.start();
        th2.start();
        th3.start();
    }

    @Override
    public void run() {
           while (true){
            if (!buyTicket()){
                break;
            }
            try {
                Thread.sleep(3);
            }catch (Exception e){
              e.printStackTrace();
            }

           }
    }


    public synchronized boolean buyTicket(){
           if (ticket<=0){
               return false;
           }
            try {
                Thread.sleep(2);
            }catch (Exception e){
                e.printStackTrace();
            }

           System.out.println(Thread.currentThread().getName()+"买了"+ticket+"票");
           ticket--;
           return true;
    }
}
