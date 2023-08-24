package com.study.chapter6.part27;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法与类型通配符
 * 方法的参数是集合，并在方法内要向集合添加元素，则采用泛型方法
 * 多个参数之间，或者返回值与参数之间，其类型存在依赖关系，则采用泛型方法
 */
public class GenericDemo6 {

    public static void main(String[] args) {
        Double[] scores = {50.00, 70.00, 80.00, 90.00};
        List<Number> scoreList = new ArrayList<>();
        arrayToList(scores, scoreList);
        System.out.println(scoreList);
    }

    public static <T, S extends T> void arrayToList(S[] array, List<T> list) {
        if (array == null || list == null) {
            return;
        }
        for (S s : array) {
            list.add(s);
        }
    }
}
