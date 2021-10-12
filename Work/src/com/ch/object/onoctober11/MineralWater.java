package com.ch.object.onoctober11;

/**
 * @author procedure sail
 * @date 2021/10/11 20:16
 */
public class MineralWater extends Drink {
    public MineralWater() {
    }

    public MineralWater(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public  void show() {
        System.out.println("你购买的饮料信息如下");
        System.out.println("名称:"+getName());
        System.out.println("添加的配料:无添加");
        System.out.println("容量"+getCapacity());
    }


    @Override
    public String toString() {
        return "MineralWater{} " + super.toString();
    }
}
