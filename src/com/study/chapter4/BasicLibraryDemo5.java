package com.study.chapter4;

/**
 * 包装类
 */
public class BasicLibraryDemo5 {

    public static void main(String[] args) {
        // 自动装箱
        Double od = 3.14;
        Boolean ob = true;

        // 自动拆箱
        double d = od;
        boolean b = ob;

        System.out.println(d);
        System.out.println(b);

        // 字符串转为基本类型
        double dd = Double.parseDouble("3.14");
        System.out.println(dd);

        // 基本类型转为字符串
        String s1 = String.valueOf(1);
        String s2 = String.valueOf('c');
        System.out.println(s1);
        System.out.println(s2);

    }
}
