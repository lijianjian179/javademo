package com.study.chapter3.part19;

import java.util.Arrays;

/**
 * final修饰引用类型变量，可以改变值，但不可以该地址：改为null或者重新初始化
 */
public class FinalDemo4 {

    public static void main(String[] args) {
        final int[] nums = {1, 2, 3, 9, 5};
        System.out.println(Arrays.toString(nums));

        nums[0] = 8;
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

//        nums = null;
//        nums = new int[]{5, 4, 3, 2, 1};

        final Car car = new Car("奔驰");
        System.out.println(car.getBrand());
        car.setBrand("宝马");
        System.out.println(car.getBrand());

        final String s = "Hello";
//        s = "Hello World";
    }
}

class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}