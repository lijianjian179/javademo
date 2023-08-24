package com.study.chapter6.part27;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 擦除与转换
 */
public class GenericDemo7 {

    public static void main(String[] args) {
        // 擦除
        Anything<Integer> a = new Anything<>(100);
        System.out.println(a.getData().compareTo(200));

        Anything b = a; // b的类型参数为Number
        System.out.println(b.getData().doubleValue());

        // 转换
        Queue queue = new ArrayDeque();
        queue.offer("John");
        queue.offer("Mary");

        // 包含了隐患
        Queue<String> queue1 = queue;
        System.out.println(queue1.poll().toUpperCase());

        // 错误的示范
//        Queue<Integer> queue2 = queue;
//        System.out.println(queue2.poll().doubleValue());
    }
}

class Anything<T extends Number> {

    private T data;

    public Anything(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
