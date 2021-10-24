package com.ch.yjxxt.work;

/**
 * @author procedure sail
 * @date 2021/10/23 10:54
 * wait()让线程进入等待状态
 * notify()唤醒线程
 */
public class Test01 {
    public static void main(String[] args) {
        Street street = new Street();
        new Thread(new Car(street)).start();
        new Thread(new Person(street)).start();
    }
}

/**
 * 街道:信号灯,人:南北走向;车东西走向
 */
class Street{

    private boolean semaphore=false; //默认红灯

    public synchronized void  nb(){
        if (semaphore){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("人过斑马线");
            //切换红绿灯
            semaphore=false;
            this.notify();
            //进入休眠状态
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void dx(){
        if (!semaphore){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("车在起飞");
            //切换红绿灯
            semaphore=true;
            this.notify();
            //进入休眠状态
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Person implements Runnable{
    private Street street;

    public Person(Street street) {
        this.street = street;
    }

    @Override
    public  void run() {
        while (true){
            street.nb();
        }
    }
}


class Car implements Runnable{

    private Street street;

    public Car(Street street) {
        this.street = street;
    }

    @Override
    public  void run() {
        while (true){
            street.dx();
        }
    }
}
