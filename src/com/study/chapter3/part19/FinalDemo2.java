package com.study.chapter3.part19;

/**
 * final修饰成员变量
 * 初始化后不可以再改变值
 */
public class FinalDemo2 {

    public static final int a = 1;
    public static final int b;

    public final double i = 1.0;
    public final double j;
    public final double k;

    static {
//        System.out.println(b);
        b = 2;

//        a = 2;
//        b = 3;
    }

    {
        j = 2.0;
    }

    public FinalDemo2() {
//        System.out.println(k);
        k = 3.0;
    }

    public static void main(String[] args) {
        System.out.println(FinalDemo2.a);

        FinalDemo2 finalDemo2 = new FinalDemo2();
        System.out.println(finalDemo2.j);
    }

}
