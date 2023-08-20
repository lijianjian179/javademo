package com.study.chapter3.part17;

public class Driver {

    private long licenseNo;
    private String name;
    private int age = 18;

    // 编译器会将块中代码编入每一个构造器的开头
    {
        System.out.println("Init license No.");
        licenseNo = System.currentTimeMillis();
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("LicenseNo:" + this.licenseNo);
    }
}
