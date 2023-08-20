package com.study.chapter4;

import java.util.Scanner;

/**
 * 用户输入
 */
public class BasicLibraryDemo2 {

    public static void main(String[] args) {
        // main()的参数

        // Scanner
        Scanner scanner = new Scanner(System.in);

//        while(scanner.hasNextInt()) {
//            int score = scanner.nextInt();
//            if (score < 0) {
//                break;
//            }
//            System.out.println("本次输入：" + score);
//        }

        scanner.close();
    }
}
