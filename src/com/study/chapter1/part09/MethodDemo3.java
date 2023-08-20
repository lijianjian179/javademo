package com.study.chapter1.part09;

/**
 * 命令行参数的使用
 * 命令行参数是在执行程序时紧跟在程序后面的信息
 * 以下程序打印所有的命令行参数
 * idea通过run里面的edit configuration -> program argument传命令行
 */
public class MethodDemo3 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
