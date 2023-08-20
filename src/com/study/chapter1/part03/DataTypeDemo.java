package com.study.chapter1.part03;

/**
 * 基本数据类型以及相互之间转换
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        // 1. 直接写出的值叫直接量
        System.out.println(9);

        // 2. int
        int i = 123;
        i = 2000000000;
        // 运算超出范围，结果错误
        i = 2147483647; // 0111...
        System.out.println(i + 1); // 1000... 1表示负数, 0表示非负

        // 3. byte, short, long
        long l = 2;
        l = 3000000000L;
        // int直接量可直接赋值给byte, short, 但不能超出其范围
        byte b = 4;
        // b = 128;

        // 浮点类型 科学计数法
        // 先将小数转换为科学计数法
        // 再将一串二进制的整数分为三段
        // 分别记录小数的符号、尾数、指数
        // 不精确性：小数是连续的，任意两个小数之间都有无穷多个数字，浮点表示法不能穷尽这些数字，只能返回一个近似值

        // 4. float, double
        double d = 0.3;
        float f = 0.8F;
        // 浮点数不精确
        System.out.println(300000.02f);
        System.out.println(300000.03f);
        System.out.println(300000.04f);
        System.out.println(3.3f + 0.1f);

        // 5. char
        char c1 = 'A';
        char c2 = 0b01000001; // 65
        char c3 = '\u0041'; // unicode(16进制)
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        // 转义字符
        char c4 = '\'';
        char c5 = '\\';
        char c6 = '\t';
        char c7 = '\n';

        System.out.print(c4);
        System.out.print(c5);
        System.out.print(c6);
        System.out.print(c7);
        // 字符串
        String str = "Hello World.";
        System.out.println(str);

        // 6. boolean
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        int age = 25;
        System.out.println(age < 18);

        // 7. 类型转换
        // 浮点数到整数转换通过舍弃小数得到，而不是四舍五入
        // byte < short,char < int < long < float < double
        float f1 = 3.14f;
        int i1 = (int)f1;
        System.out.println(i1);
        // 自动类型转换
        char c = 'A';
        int i2 = c;
        System.out.println(i2);
        // 强制类型转换
        int i3 = 65;
        char c8 = (char) i3;
        System.out.println(c8);
        // 运算时的自动类型转换
        // 先将byte,short,char转为int
        // 再将int转换为更大的类型
        char c9 = 'A';
        int i4 = 100;
        double dd = 3.14;
        System.out.println(c9 + i4 + dd);

        // 注意如下的坑
        byte b3 = 8;
        b = (byte) (b - 3);

        // 下列情况是默认规则，不是类型转换
        byte k = 5;
        short m = 6;
        char n = 7;

    }
}
