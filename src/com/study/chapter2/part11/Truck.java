package com.study.chapter2.part11;

public class Truck {

    String brand;
    String color;
    int capacity;
    long engineNo;

    public Truck(String b, String c, int p) {
        brand = b;
        color = c;
        capacity = p;
        engineNo = System.currentTimeMillis();
    }

    public void run() {
        System.out.println(color + brand + "载重" + capacity + "吨！");
    }

    public void showEngineNo() {
        System.out.println("发动机编号" + engineNo);
    }
}
