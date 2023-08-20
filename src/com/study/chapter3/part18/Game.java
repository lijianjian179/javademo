package com.study.chapter3.part18;

import java.util.Arrays;

/**
 * static关键字
 */
public class Game {

    public static void main(String[] args) {
        Policeman p1 = new Policeman("Tom");
        p1.chase();

        Policeman p2 = new Policeman("John");
        p2.chase();

        System.out.println(Arrays.toString(Policeman.image));
        System.out.println(Policeman.getOath());
    }
}
