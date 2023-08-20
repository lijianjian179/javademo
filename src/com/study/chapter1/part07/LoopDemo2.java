package com.study.chapter1.part07;

import java.util.Scanner;

/**
 * 死循环
 */
public class LoopDemo2 {

    public static void main(String[] args) {
        // 刻意营造,两种方式
//        while (true) {
//            System.out.println("Hello.");
//        }

//        for (; ; ) {
//            System.out.println("Hello.");
//        }

        // 输入任意多个整数（负数代表输入结束），求它们的平均数
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        int amount = 0;

        while (true) {
            System.out.print("请输入（负数结束）：");
            n = scanner.nextInt();

            if (n < 0) {
                break;
            }
            sum += n;
            amount++;
        }

        if(amount > 0) {
            double avg = (double) sum / amount;
            System.out.println("平均数为：" + avg);
        }

        scanner.close();
    }
}
