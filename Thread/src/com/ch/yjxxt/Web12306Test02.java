package com.ch.yjxxt;

/**
 * @author procedure sail
 * @date 2021/10/22 17:12
 */
public class Web12306Test02 implements Runnable{
    private Integer ticket=100;
    public static void main(String[] args) {
        Web12306Test02 web12306Test02 = new Web12306Test02();

        Thread th1 = new Thread(web12306Test02, "张三");
        Thread th2 = new Thread(web12306Test02, "李四");
        Thread th3 = new Thread(web12306Test02, "王五");

        th1.start();
        th2.start();
        th3.start();
    }

    @Override
    public void run() {
        while (true){
            synchronized (Web12306Test02.class){
                if (ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(5);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"买到了第"+ticket+"票");
                ticket--;
            }
        }
    }
}
