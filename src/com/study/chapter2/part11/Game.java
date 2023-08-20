package com.study.chapter2.part11;

/**
 * 构造方法
 */
public class Game {

    public static void main(String[] args) {
        Truck truck = new Truck("红旗", "蓝色", 20);
        truck.run();
        truck.showEngineNo();
    }
}
