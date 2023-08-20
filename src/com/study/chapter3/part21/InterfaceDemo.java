package com.study.chapter3.part21;

import java.util.Arrays;

/**
 * 接口定义示例
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        System.out.println(Interface1.SIZE);
        System.out.println(Interface2.min(1, 2));

        A a = new A();
        System.out.println(a.sum(1, 2));
        System.out.println(a.max(1, 2));

        B b = new B();
        System.out.println(b.sum(3, 4));
        System.out.println(b.max(3, 4));

        int[] nums = {5, 4, 3, 2, 1};
        b.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class A implements Interface1, Interface2 {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}

class B implements Interface3 {

    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }

    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}
