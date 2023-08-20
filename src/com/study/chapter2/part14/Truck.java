package com.study.chapter2.part14;

public class Truck extends Vehicle{

    int capacity;

    void unload() {
        System.out.println(brand + "已经卸货" + capacity + "吨！");
        capacity = 0;
    }
}
