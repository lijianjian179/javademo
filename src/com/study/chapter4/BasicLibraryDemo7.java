package com.study.chapter4;

/**
 * String类
 */
public class BasicLibraryDemo7 {

    public static void main(String[] args) {
        // ==, equals()
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // 直接量存储在方法区内字符串类型的常量池中
        // 内容相同的直接量在常量池中只保存一份
        String str3 = "Hello World";
        String str4 = "Hello World";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = new String("Hello World");
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

    }
}
