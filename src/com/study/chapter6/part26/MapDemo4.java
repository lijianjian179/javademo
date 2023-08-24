package com.study.chapter6.part26;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap
 */
public class MapDemo4 {

    public static void main(String[] args) {
        TreeMap map = null;

        // 自然排序
        map = new TreeMap();
        map.put("Mary", 80);
        map.put("John", 90);
        map.put("Lily", 60);
        map.put("Lisa", 50);
        System.out.println(map);

        System.out.println(map.firstKey() + ", " + map.lastKey());
        System.out.println(map.lowerKey("Lily") + ", " + map.higherKey("Lily"));
        System.out.println(map.headMap("John"));
        System.out.println(map.tailMap("John"));

        // 定制排序
        map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
