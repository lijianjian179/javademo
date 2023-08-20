package com.study.chapter1.part04;

/**
 * 运算符使用示例
 */
public class OperatorDemo {

    public static void main(String[] args) {
        // 1. 算数运算符
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        // ++i, i++
        int i = 10;
        ++i;
        // ++a先自增，再运算
        int a = 100;
        System.out.println(++a + 100);
        System.out.println(a);
        // b++先运算，再自增
        int b = 100;
        System.out.println(b++ + 100);
        System.out.println(b);

        // 2. 关系运算符

        // 3. 逻辑运算符
        int age = 32;
        double salary = 3000.00;
        boolean result = age < 30 && salary > 2000.00;
        System.out.println(result);

        result = age < 30 || salary > 2000.00;
        System.out.println(result);

        result = !(age < 30 || salary > 2000.00);
        System.out.println(result);

        // &&, || 存在短路现象
        System.out.println(salary > 5000.00 && ++age < 30);
        System.out.println(age);

        // 4. 赋值运算符
        salary += 1000.00;
        System.out.println(salary);

        // 5. 三目运算符
        // 示例：age < 18 ? "未成年" : "已成年"
        String title = age > 30 ? "小姐姐" : "小妹妹";
        System.out.println(title);

        // 6. 字符串运算符
        String s1 = "她的年龄：" + age;
        System.out.println(s1);

        String s2 = "她的工资：" + salary;
        System.out.println(s2);

        System.out.println("" + 100 + 200);
        System.out.println(100 + 200 + "");

        // 7. 位运算符
        int l = 60; // 60 = 0011 1100
        int m = 13; // 13 = 0000 1101
        int n = 0;
        n = l & m; //  12 = 0000 1100
        System.out.println("l & m = " + n);

        n = l | m; //  61 = 0011 1101
        System.out.println("l | m = " + n);

        n = l ^ m; //  49 = 0011 0001   相同为0，不同为1
        System.out.println("l ^ m = " + n);

        n = ~l;    //  -61 = 1100 0011  符号位为1负数，因此其正数应该为补码求整，对1100 0011进行反码加1
        System.out.println("~l = " + n);

        System.out.println("5 << 2 = " + (5 << 2));
        System.out.println("-5 << 2 = " + (-5 << 2));
        System.out.println("-5 >> 2 = " + (-5 >> 2));
        System.out.println("-5 >>> 2 = " + (-5 >>> 2));

        // 不同进制的整数表示方式
        System.out.println(0b1010); // 二进制数
        System.out.println(012);    // 八进制
        System.out.println(0xA);    // 十六进制

        // 将十进制转换为二进制
        System.out.println(Integer.toBinaryString(5));
    }
}
