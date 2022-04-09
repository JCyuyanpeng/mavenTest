package com.maven03;

public class Teacher extends Demo{

    public Teacher(){}
    public Teacher(String name, int age){
//        this.name = name;
//        this.age = age;
        super(name, age);
    }
    public void show(){
        System.out.println("teacher");
//        System.out.println(name + ", " + age);
    }
}
