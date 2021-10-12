package com.ch.object.tentenwork.It;

import java.util.Objects;

/**
 * @author procedure sail
 * @date 2021/10/10 21:14
 */
public  class IT {
    private String name;
    private Integer age=15;
    private String technicalDirection;
    private Integer limitAge;
    private String address;
    private String job;


    public IT(String name, Integer age, String technicalDirection, Integer limitAge) {
        this.name = name;
        this.technicalDirection = technicalDirection;
        this.limitAge = limitAge;
        if (this.age>=15){
            this.age = age;
        }else {
            System.out.println("你的年龄不满足最低要求");
        }
    }

    public IT() {
    }


    public void work(String address, String job){
        System.out.println("我的工作单位"+address+",我的职位"+job);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (this.age>=15){
            this.age = age;
        }else {
            System.out.println("你的年龄不满足最低要求");
        }
    }

    public String getTechnicalDirection() {
        return technicalDirection;
    }


    public Integer getLimitAge() {
        return limitAge;
    }

    public void setLimitAge(Integer limitAge) {
        this.limitAge = limitAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IT it = (IT) o;
        return Objects.equals(name, it.name) &&
                Objects.equals(age, it.age) &&
                Objects.equals(technicalDirection, it.technicalDirection) &&
                Objects.equals(limitAge, it.limitAge) &&
                Objects.equals(address, it.address) &&
                Objects.equals(job, it.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, technicalDirection, limitAge, address, job);
    }

    @Override
    public String toString() {
        return "IT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", technicalDirection='" + technicalDirection + '\'' +
                ", limitAge=" + limitAge +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
