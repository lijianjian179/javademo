package com.study.chapter1.part09;

/**
 * 演示按值传递的效果，创建一个用于交换两个变量的方法
 */
public class MethodDemo2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("交换前 a = " + a + ", b = " + b);

        swap(a, b);

        // 交换后实参的值并没有改变
        System.out.println("交换后 a = " + a + ", b = " + b);
    }

    public static void swap(int n1, int n2) {
        System.out.println("\t" + "进入swap方法");
        System.out.println("\t" + "交换前 n1 = " + n1 + ", n2 = " + n2);

        // 交换a，b的值
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t" + "交换后 n1 = " + n1 + ", n2 = " + n2);
    }

}
