package com.study.chapter2.part10;

public class TeacherTest {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("zhangfei");
        Teacher t2 = new Teacher("guanyu");

        t1.setAge(26);
        t1.setSalary(1000);
        t1.printTeacher();

        t2.setAge(30);
        t2.setSalary(4000);
        t2.printTeacher();
    }
}
