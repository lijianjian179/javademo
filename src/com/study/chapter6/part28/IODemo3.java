package com.study.chapter6.part28;

import java.io.File;

/**
 * 遍历文件
 */
public class IODemo3 {

    public static void main(String[] args) {
//        printFile("C:/work/alpha", 0);
        printFile("C:/work/workspace/javademo/javademo", 0);
    }

    public static void printFile(String filePath, int depth) {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IllegalArgumentException("文件不存在！");
        }

        // 打印空格
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        // 打印名字
        if (file.isFile()) {
            System.out.print(" - ");
        }
        System.out.println(file.getName());

        // 目录递归
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                printFile(file1.getPath(), depth + 1);
            }
        }
    }
}
