package com.yjjxt.ch;

import java.util.Date;
import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/16 15:28
 *
 *      定义一个员工类,
 *     员工姓名,年龄,工号,入职时间,薪资,员工工作状态(忙碌,空间,正常)
 *     找到找到2021年入职的员工,打印
 *     找到工作状态忙碌的员工,薪资涨%6
 */
public class Employee {

    private String name;
    private int age;
    private int id;
    private Employees employees;
    private Date startTime;
    private double price;


    public Employee() {
    }

    public Employee(String name, int age, int id, Employees employees, Date startTime, double price) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.employees = employees;
        this.startTime = startTime;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                id == employee.id &&
                Double.compare(employee.price, price) == 0 &&
                Objects.equals(name, employee.name) &&
                employees == employee.employees &&
                Objects.equals(startTime, employee.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, employees, startTime, price);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", employees=" + employees +
                ", startTime=" + startTime +
                ", price=" + price +
                '}';
    }
}

enum Employees{
     BUSY("忙碌"),SPACE("空闲"),NORMAL("正常");

    private String workStatus;

    public String getWorkStatus() {
        return workStatus;
    }

    Employees() {
    }

    Employees(String workStatus) {
        this.workStatus = workStatus;
    }
}
