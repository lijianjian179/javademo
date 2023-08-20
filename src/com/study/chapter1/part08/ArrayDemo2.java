package com.study.chapter1.part08;

import java.util.Arrays;

/**
 * Arrays 工具类
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
        // 打印数组
        int[] array1 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array1));

        // 比较数组
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.equals(array1, array2));

        // 排序数组
        int[] array3 = {20, 40, 10, 50, 40};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        // 复制数组
        int[] array4 = Arrays.copyOf(array3, 4);
        int[] array5 = Arrays.copyOf(array3, 6);
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));

        // 数组扩容
        int[] ownNums = {5, 10, 15, 20, 25, 30, 6};
        ownNums = Arrays.copyOf(ownNums, ownNums.length + 1);
        ownNums[ownNums.length - 1] = (int) (Math.random() * 16 + 1);
        System.out.println(Arrays.toString(ownNums));
    }
}
