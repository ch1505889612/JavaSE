package com.ch.object.tentenwork.circle;

/**
 * @author procedure sail
 * @date 2021/10/10 18:53
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 获取圆的面积
     * @return
     */
    public double getArea(double radius){
      return Math.PI*radius*radius;
    }

    /**
     * 获取圆的周长
     * @return
     */
    public double getPerimeter(double radius){
         return Math.PI*2*radius;
    }

    /**
     * 将圆的关径、周长、面积输出到屏幕
     */
    public void show(){
        System.out.println("圆的半径"+this.radius);
        System.out.println("圆的周长"+getArea(this.radius));
        System.out.println("圆的面积"+getPerimeter(this.radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.show();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
