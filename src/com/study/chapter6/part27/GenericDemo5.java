package com.study.chapter6.part27;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 */
public class GenericDemo5 {

    public static void main(String[] args) {
        String[] nameArray = {"John", "Mary", "Lucy"};
        List<String> nameList = new ArrayList<>();
        arrayToList(nameArray, nameList);
        System.out.println(nameList);

        Double[] scores = {20.00, 50.00, 90.00, 80.00};
        List<Double> scoreList = new ArrayList<>();
        arrayToList(scores, scoreList);
        System.out.println(scoreList);
    }

    public static <T> void arrayToList(T[] array, List<T>list) {
        if (array == null || list == null) {
            return;
        }
        for (T t : array) {
            list.add(t);
        }
    }
}
