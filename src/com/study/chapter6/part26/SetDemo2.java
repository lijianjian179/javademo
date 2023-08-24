package com.study.chapter6.part26;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class SetDemo2 {

    public static void main(String[] args) {
        TreeSet scores = new TreeSet();
        scores.add(83);
        scores.add(46);
        scores.add(78);
        scores.add(92);
        scores.add(15);
        scores.add(36);
        System.out.println(scores);

        System.out.println(scores.first() + " - " + scores.last());
        System.out.println(scores.lower(60) + " - " + scores.higher(60));
        System.out.println(scores.headSet(60));
        System.out.println(scores.tailSet(60));


        // 定制排序
        TreeSet nums = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Number n1 = (Number) o1;
                Number n2 = (Number) o2;
                if (n1 == null && n2 == null) {
                    return 0;
                } else if (n1 == null) {
                    return -1;
                } else if (n2 == null) {
                    return 1;
                } else if (n1.doubleValue() > n2.doubleValue()) {
                    return 1;
                } else if (n1.doubleValue() < n2.doubleValue()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        nums.add(80);
        nums.add(null);
        nums.add(79.98);
        nums.add(79.99);
        nums.add(932.1);
        nums.add(0);
        System.out.println(nums);

    }
}
