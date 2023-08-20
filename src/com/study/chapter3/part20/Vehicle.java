package com.study.chapter3.part20;

public abstract class Vehicle {

    public Vehicle() {
        System.out.println("Init Vehicle.");
    }

    public abstract void startup();

    public void speedup() {
        System.out.println("加速！");
    }

    public void stop() {
        System.out.println("刹车！");
    }

    // 模板模式
    public void run() {
        startup();
        speedup();
        stop();
    }
}
