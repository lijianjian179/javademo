package com.study.chapter6.part26;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * HashSet
 */
public class SetDemo1 {

    public static void main(String[] args) {
        HashSet students = new HashSet();
        students.add("张三");
        students.add("李四");
        students.add("李四");
        students.add("王五");
        students.add(null);

        System.out.println(students);

        LinkedHashSet teachers = new LinkedHashSet();
        teachers.add("小李");
        teachers.add("小张");
        teachers.add("小王");
        teachers.add("小张");
        teachers.add(null);
        System.out.println(teachers);
    }
}
