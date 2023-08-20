package com.study.chapter1.part08;

/**
 * 数组基本操作
 */
public class ArrayDemo1 {

    public static void main(String[] args) {
        // 静态初始化
        int[] ownNums = {5, 10, 15, 20, 25, 30, 6};

        for(int num : ownNums) {
            System.out.print(num + "\t");
        }

        // 动态初始化
        int[] ranNums = new int[7];
        // 红色球 [1, 33]
        for (int i = 0; i < 6; i++) {
            ranNums[i] = (int) (Math.random() * 33 + 1);
        }
        // 蓝色球 [1, 16]
        ranNums[ranNums.length - 1] = (int) (Math.random() * 16 + 1);

        System.out.println();
        for (int i = 0; i < ranNums.length; i++) {
            System.out.print(ranNums[i] + "\t");
        }
        System.out.println();

        // 打印数组
        printArray(ranNums);

        // 倒序数组
        printArray(reverseArray(ranNums));

    }
    // 数组作为参数传递给方法
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // 数组作为函数的返回值
    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[result.length - i -1] = array[i];
        }
        return result;
    }
}
