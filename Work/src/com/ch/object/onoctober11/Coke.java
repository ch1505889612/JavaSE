package com.ch.object.onoctober11;

/**
 * @author procedure sail
 * @date 2021/10/11 20:17
 */
public class Coke extends Drink{
    //可乐类型
    private String type;

    public Coke() {
    }

    public Coke(String name, int capacity, String type) {
        super(name, capacity);
        this.type = type;
    }

    @Override
  public   void show() {
        System.out.println("你购买的饮料信息如下");
        System.out.println("名称:"+getName());
        System.out.println("添加的配料:"+getType());
        System.out.println("容量"+getCapacity());
    }



    @Override
    public String toString() {
        return "Coke{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
