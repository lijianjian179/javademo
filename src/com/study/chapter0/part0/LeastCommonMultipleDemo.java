package com.study.chapter0.part0;

import java.util.Scanner;

/**
 * 求两个数的最小公倍数
 */
public class LeastCommonMultipleDemo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
        console.close();
    }

    public static int getCM(int m, int n){

        //write your code here......
        int cm = 0;

        if (m > n && m % n == 0) {
            cm = m;
        } else if (m < n && n % m == 0) {
            cm = n;
        } else {
            for (int i = 1; i <= n; i++) {
                if ((m * i) % n == 0) {
                    cm = m * i;
                    break;
                }
            }
        }
        return cm;

    }
}
