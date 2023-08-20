package com.study.chapter2.part16;

/**
 * 多态
 */
public class Game {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.brand = "奔驰";

        Bus b = new Bus();
        b.brand = "黄海";
        b.passengers = 50;

        Driver d = new Driver();
        d.drive(v);
        d.drive(b);

        // 默认向上转型
        Vehicle vehicle = new Bus();
        // 强制类型转换
        Bus bus = (Bus) vehicle;

    }
}
