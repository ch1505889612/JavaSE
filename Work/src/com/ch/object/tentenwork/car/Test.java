package com.ch.object.tentenwork.car;

/**
 * @author procedure sail
 * @date 2021/10/10 19:25
 */
public class Test {

    public static void main(String[] args) {
        HomeCar homeCar = new HomeCar("大奔","鄂F66666","飞飞");
        homeCar.melody("大奔");
        Taxi taxi = new Taxi("出租车","京A555555","天门");
        taxi.start("出租车");
    }
}
