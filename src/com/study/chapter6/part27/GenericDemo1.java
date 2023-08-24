package com.study.chapter6.part27;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 */
public class GenericDemo1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lily");
        names.add("Mary");
        names.add("Tony");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }
}
