package com.study.chapter6.part26;

import java.util.*;

/**
 * Collections
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        // 排序
        List scores = new ArrayList();
        scores.add(90);
        scores.add(50);
        scores.add(70);
        scores.add(80);
        scores.add(60);
        System.out.println(scores);

        // 洗牌
        Collections.shuffle(scores);
        System.out.println(scores);

        Collections.sort(scores);
        System.out.println(scores);

        Collections.reverse(scores);
        System.out.println(scores);

        // 查找，替换
        // Collections
        Object max = Collections.max(scores);
        System.out.println(max);
        Object min = Collections.min(scores);
        System.out.println(min);

        // List
        int index = Collections.binarySearch(scores, 70);
        System.out.println(index);
        Collections.replaceAll(scores, 60, 65);
        System.out.println(scores);

        // 不可变集合
        List list = Collections.emptyList();
//        list.add(100);
        Set set = Collections.singleton(200);
//        set.add(300);

        List scoreList = Collections.unmodifiableList(scores);
        System.out.println(scoreList);
//        scoreList.add(30);
    }
}
