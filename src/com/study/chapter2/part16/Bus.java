package com.study.chapter2.part16;

public class Bus extends Vehicle{

    int passengers;

    @Override
    void run() {
        System.out.println("Bus run:" + super.brand);
    }

    void brush() {
        System.out.println("Bus brush:" + passengers);
    }
}
