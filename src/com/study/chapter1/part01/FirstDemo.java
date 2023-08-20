package com.study.chapter1.part01;

public class FirstDemo {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String a = "里渐渐";
        String b = "里渐渐";
        System.out.println(a == b);


//        mystery(1234);
    }

    public static void mystery(int x) {
        System.out.print(x % 10);

        if ((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
}
