package com.study.chapter1.part07;

import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class LoopDemo3 {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100 + 1);

//        System.out.println(randomNum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入：");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input < randomNum) {
                System.out.println("小了！");
            } else if (input > randomNum) {
                System.out.println("大了！");
            } else {
                System.out.println("对了！");
                break;
            }
            System.out.print("请输入：");
        }
        scanner.close();
    }
}
