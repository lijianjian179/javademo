package com.study.chapter1.part09;

/**
 * 方法递归
 */
public class MethodDemo6 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(9));
    }

    // 阶乘
    // n! = n * (n - 1)!
    public static long factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // 斐波那契数列
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    // f(1) = 1, f(2) = 1, f(x) = f(x - 1) + f(x - 2)
    public static long fibonacci(int index) {
        if (index == 1 || index == 2)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
