package com.maven01;

public class TestNG02 {

    String name;
    int age;
    public TestNG02(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + ", " + age);
    }
}
