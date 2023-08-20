package com.study.chapter3.part23;

import com.study.chapter3.part22.util.ArrayUtil;
import com.study.chapter3.part22.util.Comparator;

import java.util.Arrays;

/**
 * 内部类
 */
public class InnerDemo {

    public static void main(String[] args) {
        // 非静态内部类
        OuterFirst.Inner inner = new OuterFirst().new Inner(1920, 1080);
        inner.print();

        // 静态内部类
        OuterSecond.Inner.show();
        OuterSecond.Inner inner1 = new OuterSecond.Inner("nowcoder");
        inner1.print();

        // 局部内部类
        class Inner {

        }

        // 匿名内部类
        int[] nums = {10, 4, 13, 1, 8};
        ArrayUtil.sort(nums, new Comparator() {
            @Override
            public int compare(int m, int n) {
                return m - n;
            }
        });
        System.out.println(Arrays.toString(nums));
    }
}
