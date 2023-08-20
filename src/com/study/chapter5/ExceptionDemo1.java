package com.study.chapter5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 捕获异常
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
//        process1(args);
//        process2(args);
//        process3(null);
        process4("C://work/1.txt");
    }

    public static void process1(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println("m / n = " + (m / n));
        } catch (Exception e) {
            System.out.println("###");
            e.printStackTrace();

            System.out.println("###");
            System.out.println(e.getMessage());

            System.out.println("###");
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public static void process2(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println("m / n = " + (m / n));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // NullPointerException
    // ClassCastException
    public static void process3(Object obj) {
        String str = obj.toString();
        Integer num = (Integer) obj;
    }

    // Checked异常
    public static void process4(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("未知异常：");
            e.printStackTrace();
        }
    }
}
