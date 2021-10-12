package com.ch.object.onoctober11;

/**
 * @author procedure sail
 * @date 2021/10/11 20:12
 */
public class Coffee extends Drink {
    //配料
    private String info;

    public Coffee() {
    }

    @Override
   public void show() {
        System.out.println("你购买的饮料信息如下");
        System.out.println("名称:"+getName());
        System.out.println("添加的配料:"+getInfo());
        System.out.println("容量"+getCapacity());
    }

    public Coffee(String name, int capacity, String info) {
        super(name, capacity);
        this.info = info;

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "info='" + info + '\'' +
                "} " + super.toString();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
