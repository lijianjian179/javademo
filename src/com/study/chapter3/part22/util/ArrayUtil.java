package com.study.chapter3.part22.util;

// 命令模式
public class ArrayUtil {

    // 冒泡排序
    public static void sort(int[] arr, Comparator cpr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 比较两个值
                if (cpr.compare(arr[j], arr[j + 1]) > 0 ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
