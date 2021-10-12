package com.ch.object.onoctober11;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/11 15:52
 * 培根披萨类
 */
public class Bacon extends Pizza {


    /**
     * 培根克数
     */
    private int number;

    public Bacon() {
    }

    public Bacon(String pname, double price, int size,int number) {
        super(pname, price, size);
        this.number=number;
    }

    @Override
    public void show() {
        System.out.println("名称"+getPname());
        System.out.println("价格"+getPrice());
        System.out.println("大小"+getSize());
        System.out.println("培根数量:"+getNumber());
    }





    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bacon{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bacon bacon = (Bacon) o;
        return number == bacon.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number);
    }
}
