package com.study.chapter6.part26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator
 */
public class CollectionDemo2 {

    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("唐僧");
        c.add("悟空");
        c.add("八戒");
        c.add("沙僧");
        c.add("白龙");

        for (Object obj : c) {
            System.out.println(obj);
//            if (obj.equals("悟空")) {
//                c.remove(obj);
//            }
        }
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
            if (obj.equals("悟空")) {
//                c.remove(obj);
                iterator.remove();
            }
        }
        System.out.println(c);
    }
}
