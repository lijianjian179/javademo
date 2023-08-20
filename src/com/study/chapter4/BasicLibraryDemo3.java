package com.study.chapter4;

/**
 * Object类
 */
public class BasicLibraryDemo3 {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        System.out.println(obj.equals(new Object()));

    }
}


