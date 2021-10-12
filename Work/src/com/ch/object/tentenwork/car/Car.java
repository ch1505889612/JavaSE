package com.ch.object.tentenwork.car;

import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/10 19:13
 * 所有汽车的老祖宗类
 */
public class Car {

    private String carType; //车型
    private String carPlate; //车牌

    public Car(String carType, String carPlate) {
        this.carType = carType;
        this.carPlate = carPlate;
    }

    public Car() {
    }

    /**
     * 启动
     */
    public void start(String carType){
        System.out.println("我是"+carType+",我正在启动");
    }


    /**
     * 停止
     */
    public void stop(String carType){
        System.out.println("我是"+carType+",我准备停止");
    }


    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carType, car.carType) &&
                Objects.equals(carPlate, car.carPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, carPlate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carPlate='" + carPlate + '\'' +
                '}';
    }
}
