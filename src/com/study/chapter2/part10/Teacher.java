package com.study.chapter2.part10;

public class Teacher {

    String name;;
    int age;
    double salary;

    public Teacher(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printTeacher() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("薪水：" + salary);
    }
}
