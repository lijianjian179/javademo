package com.study.chapter3.part20;

public class Motorbike extends Vehicle{

    public Motorbike() {
        super();
    }

    @Override
    public void startup() {
        System.out.println("脚踹启动！");
    }
}
