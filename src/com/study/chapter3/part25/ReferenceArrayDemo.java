package com.study.chapter3.part25;

/**
 * 引用类型数组
 */
public class ReferenceArrayDemo {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("丰田"),
                new Car("东风"),
                new Car("福特")
        };

        for (Car car : cars) {
            car.run();
        }

        Driver[] drivers = new Driver[3];
        drivers[0] = new Driver("Tom");
        drivers[1] = new Driver("Tony");
        drivers[2] = new Driver("Mike");

        for(Driver driver : drivers) {
            driver.introduce();
        }

    }
}

class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println(this.brand);
    }
}

class Driver {
    private String name;

    public Driver (String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name);
    }
}
