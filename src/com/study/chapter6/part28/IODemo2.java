package com.study.chapter6.part28;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 过滤文件
 */
public class IODemo2 {

    public static void main(String[] args) {
        File dir = new File("C:/work/alpha");

        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println(pathname);
                if (pathname.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });

        System.out.println(Arrays.toString(files));
    }
}
