package com.maven03;

public class Student extends Demo{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void show(){
        System.out.println("student");
//        System.out.println(name + ", " + age);
    }
}
