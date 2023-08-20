package com.study.chapter2.part10;

/*
 * 展示如何访问实例变量和调用成员方法
 */
public class Dog {
    int dogAge;

    // 构造器
    public Dog(String name) {
        System.out.println("小狗的名字是：" + name);
    }

    public void setDogAge(int age) {
        this.dogAge = age;
    }

    public int getDogAge() {
        return dogAge;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.setDogAge(2);
        System.out.println("小狗的年龄是：" + dog.getDogAge());
    }
}
