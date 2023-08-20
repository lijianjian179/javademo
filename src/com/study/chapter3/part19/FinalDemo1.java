package com.study.chapter3.part19;

/**
 * final修饰类的方法
 */
public final class FinalDemo1 {

}

//class FinalDemoX extends FinalDemo1 {}

class Person {
    public void sayHello() {
        System.out.println("Hello");
    }

    public final void sayGoodbye() {
        System.out.println("Goodbye");
    }
}

class Driver extends Person{
    @Override
    public void sayHello() {
        System.out.println("Driver say HI");
    }

//    public void sayGoodbye() {}
}
