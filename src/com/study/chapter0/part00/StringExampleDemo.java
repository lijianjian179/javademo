package com.study.chapter0.part00;

/**
 * 演示字符串的各种实例
 * 包括字符串比较、查找位置、字符串反转、字符串分割
 */
public class StringExampleDemo {

    public static void main(String[] args) {
        // 1. 字符串比较
        String str1 = "Hello World";
        String str2 = "hello world";
        Object objStr = str1;

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));  // 忽略大小写
        System.out.println(str1.compareTo(objStr.toString()));

        // 2. 查找字符串最后一次出现的位置
        String strOrig = "Hello world, Hello Nowcoder";
        int lastIndex = strOrig.lastIndexOf("Nowcoder");
        if(lastIndex == -1) {
            System.out.println("没有找到字符串 Nowcoder");
        } else {
            System.out.println("Nowcoder 字符串最后出现的位置：" + lastIndex);
        }

        // 3. 字符串反转
        String str3 = "nowcoder";
        String reverse = new StringBuffer(str3).reverse().toString();
        System.out.println("反转前：" + str3);
        System.out.println("反转后：" + reverse);

        // 4. 字符串分割
        String str4 = "www.nowcoder.com";
        String[] temp1;
        String delimeter = "\\."; // .号需要转义
        temp1 = str4.split(delimeter);
        for(String s : temp1) {
            System.out.print(s + " ");
        }
    }
}
