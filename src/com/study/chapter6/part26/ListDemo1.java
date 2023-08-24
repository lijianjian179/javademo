package com.study.chapter6.part26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * List
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Lily");
        names.add("Tony");
        names.add("Mary");
        names.add("John");
        names.add("Lisa");
        names.add("Tony");
        System.out.println(names);

        names.add(0, "Lucy");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        System.out.println(names.subList(1, 4));
        System.out.println(names.indexOf("John") + ", " + names.lastIndexOf("John"));

        ListIterator iterator = names.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 排序
        names.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                if (s1 == null && s2 == null) {
                    return 0;
                } else if (s1 == null) {
                    return -1;
                } else if (s2 == null) {
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        System.out.println(names);
    }
}
