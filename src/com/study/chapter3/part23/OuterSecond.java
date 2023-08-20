package com.study.chapter3.part23;

public class OuterSecond {

    private int size = 100;

    private static int count = 200;

    public void print() {
        System.out.println("OuterSecond:" + Inner.color);
        Inner.show();

        Inner inner = new Inner("nowcoder");
        System.out.println("OuterSecond:" + inner.name);
        inner.print();
    }

    public static void show() {

    }

    // 静态内部类
    public static class Inner {

        private String name;
        private static String color;

        static {
            color = "red";
        }

        public Inner(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println("Inner:" + this.name);
            System.out.println("Inner:" + OuterSecond.count);
//            System.out.println("Inner:" + OuterSecond.this.size);
        }

        public static void show() {
            System.out.println("Inner:" + color);
            System.out.println("Inner:" + OuterSecond.count);
        }
    }
}
