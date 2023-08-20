package com.study.chapter3.part18;

public class Policeman {

    // 警察图像（所有人都一样）
    public static byte[] image = null;

    // 类加载时读取图像
    static {
        System.out.println("Read a image from disk.");
        Policeman.image = new byte[]{1,2,3,4,5,6,7,8,9,0};
    }

    public static String getOath() {
        return "我志愿成为中华人民共和国人民警察，献身于...";
    }

    private String name;

    public Policeman (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void chase() {
        System.out.println(name + " is chasing!");
    }
}
