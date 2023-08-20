package com.study.chapter3.part20;

// 若子类不是抽象的，它必须实现父类的抽象方法
public class Car extends Vehicle{

    public Car() {
        super();
    }

    @Override
    public void startup() {
        System.out.println("钥匙启动！");
    }


}
