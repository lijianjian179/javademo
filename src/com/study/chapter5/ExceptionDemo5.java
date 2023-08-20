package com.study.chapter5;

/**
 * 异常跟踪栈
 */
public class ExceptionDemo5 {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
//        throw new RuntimeException("error");

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // 如果没有完整解决异常，则得将异常向上抛以便调用者发现排错
            System.out.println("整数解析失败！");
//            throw e;
            e.printStackTrace();
        }
    }
}
