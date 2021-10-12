package com.ch.object.tentenwork.circle;

/**
 * @author procedure sail
 * @date 2021/10/10 19:01
 */
public class Cylinder extends Circle {
    //圆柱体高
    private double height;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    /**
     * 获取圆柱体的体积
     * @return
     */
    public double getVolume(double r, double h){
        return Math.PI*r*r*h;
    }

    /**
     *将圆柱体的体积输出到屏幕
     */
    public void showVolume(){

        System.out.println("圆柱体的体积"+getVolume(super.getRadius(),height));
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 10);
        cylinder.showVolume();
    }
}
