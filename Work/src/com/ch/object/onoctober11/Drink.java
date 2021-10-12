package com.ch.object.onoctober11;

/**
 * @author procedure sail
 * @date 2021/10/11 20:06
 *   饮料类
 */
public abstract class Drink {
    //饮料名字
    private String name;
    //饮料容量
    private int capacity;

    public Drink() {
    }

    public Drink(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }


   public abstract void show();

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
