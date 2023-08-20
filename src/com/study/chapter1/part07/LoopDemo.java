package com.study.chapter1.part07;

/**
 * 这是一个循环实例，演示while，for循环
 */
public class LoopDemo {

    public static void main(String[] args) {
        // while循环
        int x = 10;
        while (x < 20) {
            System.out.println("x = " + x);
            x++;
        }

        // do...while循环，即使不满足条件，也至少执行一次
        int y = 20;
        do {
            System.out.println("y = " + y);
            y++;
        } while (y < 20);
        System.out.println(y);

        // for循环
        for (int i = 10; i < 20; i++){
            System.out.println("i = " + i);
        }

        // 增强for循环，主要用于数组
        int[] numbers = {10, 20, 30, 40, 50};

        for (int n : numbers){
            System.out.print(n);
            System.out.print(",");
        }
    }
}
