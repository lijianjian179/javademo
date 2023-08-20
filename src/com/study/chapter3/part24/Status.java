package com.study.chapter3.part24;

public enum Status {

    ON(){
        @Override
        public void print() {
            System.out.println("打开");
        }
    },
    OFF(){
        @Override
        public void print() {
            System.out.println("关闭");
        }
    };

    public abstract void print();
}
