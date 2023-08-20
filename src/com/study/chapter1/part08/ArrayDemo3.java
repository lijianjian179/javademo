package com.study.chapter1.part08;

import java.util.Arrays;

/**
 * 冒泡排序 从大到小
 */
public class ArrayDemo3 {

    public static void main(String[] args) {
        // 构造数组
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            // 比较的次数
            // 0: 0 ~ length - 1
            // 1: 0 ~ length - 1 - 1
            // 2: 0 ~ length - 1 - 2
            // i: 0 ~ length - 1 - i
            // 循环的边界
            // j = arr.length - 1 - i - 1
            // j + 1 = arr.length - 1 - i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
