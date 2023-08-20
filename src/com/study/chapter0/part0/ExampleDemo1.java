package com.study.chapter0.part0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 计算整数位数
 */
public class ExampleDemo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        if (num <= 0) {
            System.out.println(num);
        } else {
            // 以10为倍数依次增加，直到num比它小
            int base = 10;
            int numOfBits = 1;
            while (true) {
                if (num < base) {
                    System.out.println(numOfBits);
                    break;
                }
                base = base * 10;
                numOfBits++;
            }
        }
    }
}
