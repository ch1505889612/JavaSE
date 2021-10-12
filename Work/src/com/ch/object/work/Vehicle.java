package com.ch.object.work;

/**
 * @author procedure sail
 * @date 2021/10/8 19:38
 */
public class Vehicle {

    private int speed;
    private double size;

    private int s;

    /**
     * 移动距离
     * @return
     */
    public int move(int speed,int s){
        //声明一个变量存储移动的距离
        int sum=0;
        sum+=speed*s;
        return sum;
    }

    /**
     * 加速的时速
     * @return
     */
    public int speedUp(int speed){
        return speed;
    }

    /**
     * 减速时速
     * @return
     */
    public int speedDown(int speed){
       return speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(10);
        vehicle.setSize(2.2);

        int move = vehicle.move(6, 12);
        System.out.println("移动后的距离"+move);
        int i = vehicle.speedUp(10);
        System.out.println("当前加速之后的速度"+i);
        int i1 = vehicle.speedDown(5);
        System.out.println("当前减速后的速度"+i1);
    }
}
