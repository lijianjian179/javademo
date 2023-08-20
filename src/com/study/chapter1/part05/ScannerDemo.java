package com.study.chapter1.part05;

import java.util.Scanner;

/**
 * 演示Scanner使用，用户输入
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的名字！");
        String name = scanner.nextLine();

        System.out.println("请输入你的年龄！");
        int age = scanner.nextInt();

        // 关闭Scanner
        scanner.close();

        System.out.println("姓名：" + name + " 年龄：" + age);

    }
}
