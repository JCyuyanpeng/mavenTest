package com.maven02;

public class Zi extends Fu{

    public int age = 20;
    public void method(){
        int age = 50;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
