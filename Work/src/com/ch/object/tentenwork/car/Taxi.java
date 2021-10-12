package com.ch.object.tentenwork.car;

/**
 * @author procedure sail
 * @date 2021/10/10 19:19
 * 出租车类
 */
public class Taxi extends Car {

    private String taxiFirmName;

    public Taxi(String carType, String carPlate, String taxiFirmName) {
        super(carType, carPlate);
        this.taxiFirmName = taxiFirmName;
    }

    public Taxi() {
    }

    @Override
    public void start(String carType) {
        super.start(carType);
        super.stop(carType);
        System.out.println("乘客您好");
        System.out.println("我是"+taxiFirmName+getCarType()+"的,我的车牌"+getCarPlate());
    }


}
