package com.study.chapter3.part19;

/**
 * final修饰局部变量
 */
public class FinalDemo3 {

    public static void showInt(final int a) {
        System.out.println("a = " + a);
//        a = 100;
    }

    public void showDouble(final double b) {
        System.out.println("b = " + b);
//        b = 5.0;
    }

    public static void main(String[] args) {
        final int i = 1;
        System.out.println("i = " + i);
//        i = 2;

        final double d;
        d = 2.0;
        System.out.println("d = " + d);
//        d = 5.0;

        FinalDemo3.showInt(1);
        new FinalDemo3().showDouble(2.0);
    }
}
