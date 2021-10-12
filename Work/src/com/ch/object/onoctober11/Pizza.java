package com.ch.object.onoctober11;

import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/11 15:46
 */
public abstract class Pizza {

   private   String pname;
   private  double price;
   private  int size;

   public Pizza() {
   }

   public Pizza(String pname, double price, int size) {
      this.pname = pname;
      this.price = price;
      this.size = size;
   }

   public abstract void show();

   public String getPname() {
      return pname;
   }

   public void setPname(String pname) {
      this.pname = pname;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pizza pizza = (Pizza) o;
      return Double.compare(pizza.price, price) == 0 &&
              size == pizza.size &&
              Objects.equals(pname, pizza.pname);
   }

   @Override
   public int hashCode() {
      return Objects.hash(pname, price, size);
   }

   @Override
   public String toString() {
      return "Pizza{" +
              "pname='" + pname + '\'' +
              ", price=" + price +
              ", size=" + size +
              '}';
   }
}
