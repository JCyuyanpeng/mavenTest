package com.maven05;

public class Cat extends Animal implements Jumpping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void ect() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumpping() {
        System.out.println("猫跳高");
    }
}
