package com.study.chapter6.part28;

import java.io.*;
import java.util.Scanner;

/**
 * 重定向
 */
public class IODemo8 {

    public static void main(String[] args) {
//        testRedirectOutput();
        testRedirectInput();
    }

    public static void testRedirectOutput() {
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("C:/work/alpha/out.txt"));
                ) {
            System.setOut(ps);
            System.out.println("路从今夜白，");
            System.out.println("月是故乡明。");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testRedirectInput() {
        try (
                InputStream is = new FileInputStream("C:/work/alpha/out.txt");
                ) {
            System.setIn(is);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
