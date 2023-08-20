package com.study.chapter4;

/**
 * StringBuilder
 */
public class BasicLibraryDemo9 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        sb.append("Hello").append(" World,").append(" Hello ").append("牛客.");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        sb.insert(12, "Hello China,");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        sb.delete(0, 12); // <13
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        // 习惯的格式
        StringBuilder builder =
                new StringBuilder()
                        .append("Hello World, ")
                        .append("Hello China, ")
                        .append("Hello 牛客");
        System.out.println(builder.toString());
    }
}
