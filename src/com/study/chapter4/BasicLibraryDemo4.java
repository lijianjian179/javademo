package com.study.chapter4;

/**
 * StringBuffer类
 */
public class BasicLibraryDemo4 {

    public static void main(String[] args) {

        // StringBuilder比StringBufffer有速度优势，但StringBuilder不是线程安全的（不能同步访问）
        StringBuffer sBuffer = new StringBuffer("牛客教程官网：");
        sBuffer.append("www");
        sBuffer.append(".nowcoder");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
