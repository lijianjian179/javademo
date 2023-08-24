package com.study.chapter6.part26;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * Collection
 */
public class CollectionDemo1 {

    public static void main(String[] args) {
        Collection c = new HashSet();

        c.add(new Date());
        c.add("nowcoder");
        c.add(10); // 自动装箱

        System.out.println(c);
        System.out.println(Arrays.toString(c.toArray()));
        System.out.println(c.size());

        System.out.println(c.contains("nowcoder"));
        System.out.println(c.contains(10));

        c.remove("nowcoder");
        System.out.println(c);

        c.clear();
        System.out.println(c);
    }
}
