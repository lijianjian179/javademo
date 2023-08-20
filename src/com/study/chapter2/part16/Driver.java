package com.study.chapter2.part16;

public class Driver {

    // 运行时，实际传入的对象，可以是声明的类型，也可以是其子类
    // 编译时，只能调用声明的类型的成员，不能调用其子类型的成员
    // 声明的类型也叫编译时类型，运行时传入的类型也叫运行时类型
    void drive(Vehicle vehicle) {
        System.out.println("drive:" + vehicle.brand);
        vehicle.run();

        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            System.out.println(bus.passengers);
            bus.brush();
        }
    }
}
