package com.aaa.czj.entity;


import java.io.Serializable;

public class Person implements Serializable {

    private int dept;

    private String name;

    private int age;

    private String sex;

    public Person() {
    }

    public Person(int dept, String name, int age, String sex) {
        this.dept = dept;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dept=" + dept +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}