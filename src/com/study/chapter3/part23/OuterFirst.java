package com.study.chapter3.part23;

public class OuterFirst {

    private int width = 1024;

    public void print() {
        Inner inner = new Inner(1920, 1080);
        inner.print();
        System.out.println("OuterFirst:" + inner.width);

    }

    // 非静态内部类
    public class Inner {

        private int width;
        private int height;

        public Inner(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void print() {
            System.out.println("Inner:" + width);
            System.out.println("Inner:" + height);
            System.out.println("Outer:" + OuterFirst.this.width);
        }
    }
}
