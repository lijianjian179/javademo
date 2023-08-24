package com.study.chapter6.part27;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符
 */
public class GenericDemo4 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<String> strs = new ArrayList<>();

//        test1(objs);
//        test1(strs);

        test2(objs);
        test2(strs);
    }

    public static void test1(List<Object> list) {
        System.out.println(list);
    }

    public static void test2(List<?> list) {
        System.out.println(list);
        // 错误的示范
//        list.add(100);
    }
}
