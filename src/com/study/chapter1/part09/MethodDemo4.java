package com.study.chapter1.part09;

/**
 * 可变参数
 * 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数
 */
public class MethodDemo4 {

    public static void main(String[] args) {
        // 调用可变参数方法
        printMax(23,45,48,90,5.5);
        printMax(new double[]{3,4,5,6,7});
        printMax(-1,-2,-3);
        printMax();
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("最大值是：" + result);
    }
}
