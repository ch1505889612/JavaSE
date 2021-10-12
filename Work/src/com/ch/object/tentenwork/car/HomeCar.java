package com.ch.object.tentenwork.car;

/**
 * @author procedure sail
 * @date 2021/10/10 19:19
 *
 * 家用汽车类
 */
public class HomeCar extends Car {

    private String name;

    public HomeCar(String carType, String carPlate, String name) {
        super(carType, carPlate);
        this.name = name;
    }

    public HomeCar() {
    }


    public void melody(String carType){
        super.start(carType);
        super.stop(carType);
        System.out.println("===============================");
        System.out.println("我是"+name+"我可以起飞吗");
        System.out.println("目的地到了");
    }
}
