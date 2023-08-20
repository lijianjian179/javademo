package com.study.chapter3.part24;

/**
 * 枚举类
 * 枚举类实现接口，以及抽象类
 */
public class EnumDemo {

    public static void main(String[] args) {
        printSeasonWord(Season.FALL);
        for (Season season : Season.values()) {
            System.out.println(season);
        }

        System.out.println(Direction.SOUTH.getName());

        Gender.MALE.print();
        Gender.FEMALE.print();

        Status.OFF.print();
        Status.ON.print();
    }

    public static void printSeasonWord(Season season) {

        switch (season) {
            case SPRING:
                System.out.println("万物复苏！");
                break;
            case SUMMER:
                System.out.println("花团锦簇！");
                break;
            case FALL:
                System.out.println("硕果累累！");
                break;
            case WINTER:
                System.out.println("白雪皑皑！");
                break;
        }
    }
}
