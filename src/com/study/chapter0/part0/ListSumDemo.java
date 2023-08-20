package com.study.chapter0.part0;

/**
 * 数列为：9，99，999，...，9999999999。
 * 要求使用程序计算此数列的和，并在控制台输出结果。
 * （请尝试使用循环的方式生成这个数列并同时在循环中求和）
 */
public class ListSumDemo {

    public static void main(String[] args) {
        long[] arr = new long[10];
        long sum = 0;

        // 外层循环代表依次生成数列的数，一共10个
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                arr[i] = 9;
            } else {
                // f(0) = 9;
                // f(1) = 9 + 9 * 10^1;
                // f(2) = f(1) + 10^2
                arr[i] = arr[i - 1] + (long)(9 * Math.pow(10, i));
            }
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.print(sum);

        // 控制台输入整数，请设计一个死循环，当用户输入非正数时停止输入。
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        //write your code here......
//        while(true) {
//            if (scanner.nextInt() <= 0) {
//                System.out.println(count);
//                break;
//            }else {
//                count++;
//            }
//        }
    }
}
