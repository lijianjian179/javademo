package com.study.chapter1.part07;

/**
 * 嵌套循环
 */
public class LoopDemo1 {

    // 打印1~100之间的所有质数
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            // 判断i是不是质数
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + "\t");
            }
        }
    }
}
