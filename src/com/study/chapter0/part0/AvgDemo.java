package com.study.chapter0.part0;

import java.util.Scanner;

/**
 * 求平均数
 */
public class AvgDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        double avg;
        double sum = 0;
        while(true) {
            int n = scan.nextInt();
            if (n < 0)
                break;
            sum += n;
            count++;
        }

        avg = sum / count;
        System.out.println(String.format("%.2f",avg));
    }
}
