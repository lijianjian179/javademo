package com.study.chapter3.part24;

public enum Gender implements Printer{

    MALE() {
        @Override
        public void print() {
            System.out.println("男");
        }
    },
    FEMALE() {
        @Override
        public void print() {
            System.out.println("女");
        }
    };

//    @Override
//    public void print() {
//        switch (this) {
//            case MALE:
//                System.out.println("男");
//                break;
//            case FEMALE:
//                System.out.println("女");
//                break;
//        }
//    }
}

interface Printer {
    void print();
}
