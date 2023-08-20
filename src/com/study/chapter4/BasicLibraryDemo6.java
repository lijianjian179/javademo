package com.study.chapter4;

import java.sql.SQLOutput;

/**
 * 包装类详解
 */
public class BasicLibraryDemo6 {

    public static void main(String[] args) {
        // 不可变
        Integer i = 100;
        System.out.println(i);
        // 底层新建了一个Integer对象，地址已经改变
        i = 200;
        System.out.println(i.hashCode());

        // Number
        Double d = 200.879;
        System.out.println(d.intValue());

        // 静态常量
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
