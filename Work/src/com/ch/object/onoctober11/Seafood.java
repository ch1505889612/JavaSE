package com.ch.object.onoctober11;

import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/11 19:48
 * 海鲜披萨
 */
public class Seafood extends Pizza{

    private String info;

    public Seafood() {
    }

    public Seafood(String pname, double price, int size,String info) {
        super(pname, price, size);
        this.info=info;
    }

    @Override
    public void show() {
        System.out.println("名称"+getPname());
        System.out.println("价格"+getPrice());
        System.out.println("大小"+getSize());
        System.out.println("配料:"+getInfo());
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Seafood seafood = (Seafood) o;
        return Objects.equals(info, seafood.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), info);
    }

    @Override
    public String toString() {
        return "Seafood{" +
                "info='" + info + '\'' +
                "} " + super.toString();
    }
}
