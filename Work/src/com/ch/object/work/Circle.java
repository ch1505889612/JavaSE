package com.ch.object.work;

/**
 * @author procedure sail
 * @date 2021/10/8 19:55
 */
public class Circle {

    //半径
    private int r;



    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    /**
     * 求圆的面积
     *
     */

    public double  getArea(int r){
        return Math.PI*r*r;
    }

    /**
     * 圆的周长
     * @param r 圆的半径
     * @return
     */
    public double getPerimeter(int r){
        return Math.PI*(r<<1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(20);
        double area = circle.getArea(circle.getR());
        System.out.println("圆的面积"+area);

        double perimeter = circle.getPerimeter(circle.getR());
        System.out.println("圆的周长为"+perimeter);
    }
}
