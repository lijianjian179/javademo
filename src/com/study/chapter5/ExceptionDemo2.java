package com.study.chapter5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 回收资源
 */
public class ExceptionDemo2 {

    public static void main(String[] args) {
        process1("c:\\work\\HelloWorld.java");
    }

    public static void process1(String fileName) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            System.out.println("read file ... ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("close file ...");
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
