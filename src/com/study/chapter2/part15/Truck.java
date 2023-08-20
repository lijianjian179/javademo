package com.study.chapter2.part15;

public class Truck extends Vehicle{

    int maxSpeed = 600;
    public Truck() {
        super();
        System.out.println("Init Truck");
    }

    @Override
    void run() {
        super.run();
        System.out.println("The truck is running.");

        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
}
