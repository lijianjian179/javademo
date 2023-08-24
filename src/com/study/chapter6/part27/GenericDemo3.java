package com.study.chapter6.part27;

/**
 * 类型形参的上限
 */
public class GenericDemo3 {

    public static void main(String[] args) {
        First<Integer> f1 = new First<>(100);
        System.out.println(f1.getData().doubleValue());

//        First<String> f2 = new First<String>();

    }
}

class First<T extends Number> {

    private T data;

    public First() {

    }

    public First(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
