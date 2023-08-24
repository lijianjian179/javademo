package com.study.chapter6.part28;

import java.io.*;

/**
 * 缓冲流
 */
public class IODemo5 {

    public static void main(String[] args) {
        copyFile("C:/work/alpha/Demo.java", "C:/work/alpha/Demo-副本-1.java");
    }

    public static void copyFile(String srcFilePath, String destFilePath) {
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
                ) {
            byte[] bytes = new byte[128];
            int len = 0;
            while ((len = bis.read(bytes, 0, 128)) > 0) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
