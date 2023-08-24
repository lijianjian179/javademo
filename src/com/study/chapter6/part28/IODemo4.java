package com.study.chapter6.part28;

import java.io.*;
import java.util.Arrays;

/**
 * 文件流
 * 拷贝文件
 */
public class IODemo4 {

    public static void main(String[] args) {
//        copyFile("C:/work/alpha/head.jpg", "C:/work/alpha/head-副本.jpg");
        copyFile("C:/work/alpha/Demo.java", "C:/work/alpha/Demo-副本.java");
        copyTextFile("C:/work/alpha/Demo.java", "C:/work/alpha/Demo-拷贝.java");
    }

    public static void copyFile(String srcFilePath, String destFilePath) {
        try(
                FileInputStream fis = new FileInputStream(srcFilePath);
                FileOutputStream fos = new FileOutputStream(destFilePath);
                ) {
            byte[] bytes = new byte[128];
            int len = 0; // 实际读取的字节数
            while ((len = fis.read(bytes, 0, 128)) > 0) {
                fos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyTextFile(String srcFilePath, String destFilePath) {
        try(
                FileReader fr = new FileReader(srcFilePath);
                FileWriter fw = new FileWriter(destFilePath);
                ) {
            char[] chars = new char[128];
            int len = 0; // 实际读取的字节数
            while ((len = fr.read(chars, 0, 128)) > 0) {
                System.out.print(String.valueOf(chars, 0, len));
                fw.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
