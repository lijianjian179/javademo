package com.study.chapter2.part12;

public class Truck {

    String brand;
    String color;
    int capacity;

    public Truck(String brand) {
        this.brand = brand;
    }

    public Truck(String brand, String color) {
        this(brand);
        this.color = color;
    }

    public Truck(String brand, String color, int capacity) {
        this(brand, color);
        this.capacity = capacity;
    }

    public void startUp() {
        System.out.println("启动！");
    }

    public void run() {
        System.out.println("品牌：" + this.brand);
        System.out.println("颜色：" + this.color);
        System.out.println("载重：" + this.capacity);
        this.startUp();
    }
}
