package com.maven03;

public class Demo {

    private String name;
    private int age;

    public Demo(){}
    public Demo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
