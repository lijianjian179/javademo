package com.study.chapter1.part05;

import java.util.Scanner;

/**
 * 演示next()方法与nextLine()方法的区别
 * next()不能得到带有空格的字符串,nextLine()可以，其返回的是输入回车之前的所有字符
 */
public class ScannerDemo2 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("next方法接收：");
        if(scanner1.hasNext()) {
            String str = scanner1.next();
            System.out.println("输入的数据为：" + str);
        }

        System.out.println();
        System.out.print("nextLine方法接收：");
        if(scanner2.hasNextLine()) {
            String str = scanner2.nextLine();
            System.out.println("输入的数据为：" + str);
        }

        scanner1.close();
        scanner2.close();
    }
}
