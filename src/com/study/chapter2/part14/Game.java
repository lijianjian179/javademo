package com.study.chapter2.part14;

/**
 * 继承
 */
public class Game {

    public static void main(String[] args) {
        Bus b = new Bus();
        b.brand = "黄海";
        b.passengers = 50;
        b.run();
        b.brush();

        Truck t = new Truck();
        t.brand = "福田";
        t.capacity = 80;
        t.run();
        t.unload();

        Airplane a = new Airplane();
        a.brand = "波音";
        a.run();
    }
}
