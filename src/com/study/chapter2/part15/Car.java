package com.study.chapter2.part15;

public class Car extends Vehicle {

    @Override
    public void run() {
        super.run();
        System.out.println("The car is running.");
    }
}
