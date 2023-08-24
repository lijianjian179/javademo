package com.study.chapter6.part27;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的定义
 */
public class GenericDemo2 {

    public static void main(String[] args) {
        // 使用泛型类
        Foo<String> f1 = new Foo<>("World");
        System.out.println(f1.getData());

        Foo<Integer> f2 = new Foo<>(100);
        System.out.println(f2.getData());

        // 使用泛型类的子类
        Sub sub = new Sub("Nowcoder");
        System.out.println(sub.getData());

        // 泛型类不是一个真实的类型，只是加了一个标识告诉编译器检查类型
        List<String> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        System.out.println(list1.getClass() == list2.getClass());
    }
}

class Foo<T> {
    private T data;

    public Foo() {

    }

    public Foo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

// 定义泛型类的子类
class Sub extends Foo<String> {

    public Sub() {

    }

    public Sub(String data) {
        super(data);
    }

    @Override
    public String getData() {
        return super.getData();
    }
}
