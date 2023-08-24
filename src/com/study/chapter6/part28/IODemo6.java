package com.study.chapter6.part28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 */
public class IODemo6 {

    public static void main(String[] args) {
        try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
