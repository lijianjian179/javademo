package com.study.chapter6.part28;

import java.io.*;

/**
 * 打印流
 */
public class IODemo7 {

    public static void main(String[] args) {
//        testPrintStream();
        testPrintWriter();
    }

    public static void testPrintStream() {
        try (
                FileOutputStream fos = new FileOutputStream("C:/work/alpha/a.txt");
                PrintStream ps = new PrintStream(fos);
                ){
            ps.println("春眠不觉晓，");
            ps.println("处处闻啼鸟。");
            ps.println("夜来风雨声，");
            ps.println("花落知多少。");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testPrintWriter() {
        try (
                FileWriter fw = new FileWriter("C:/work/alpha/b.txt");
                PrintWriter pw = new PrintWriter(fw);
                ) {
            pw.println("前不见古人，");
            pw.println("后不见来者。");
            pw.println("念天地之悠悠，");
            pw.println("独怆然而涕下！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
