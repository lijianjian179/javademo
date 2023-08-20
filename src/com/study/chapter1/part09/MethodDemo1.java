package com.study.chapter1.part09;

/**
 * 演示如何定义一个方法，以及如何调用它，方法的重载
 */
public class MethodDemo1 {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println(i + "和" + j + "比较，最大值是：" + k);

        double a = 3.6;
        double b = 5.4;
        double c = max(a, b);
        System.out.println(a + "和" + b + "比较，较大值是：" + c);
    }

    // 返回两个整数中较大的值
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    // 返回两个小数中较大的值
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
