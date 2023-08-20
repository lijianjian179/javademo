package com.study.chapter2.part13;

public class Driver {

    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public void setAge(int age) {
        if (age < 0){
            this.age = 0;
        } else if (age > 200) {
            this.age = 200;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
