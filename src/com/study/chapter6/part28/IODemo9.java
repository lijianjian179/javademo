package com.study.chapter6.part28;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile
 */
public class IODemo9 {

    public static void main(String[] args) {
        try (
                RandomAccessFile raf =
                        new RandomAccessFile("C:/work/alpha/out.txt", "rw");
                ) {
            // 定位至末尾
            raf.seek(raf.length());
            raf.write("有弟皆分散，\n".getBytes());
            raf.write("无家问死生。\n".getBytes());
            // 定位至开头
            raf.seek(0);
            String line = null;
            while ((line = raf.readLine()) != null) {
                // String -> bytes (UTF-8)
                // bytes -> String (ISO8859-1)
                // String -> bytes (ISO8859-1)
                // bytes -> String (UTF-8)
                byte[] bytes = line.getBytes("ISO-8859-1");
                line = new String(bytes, "UTF-8");
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
