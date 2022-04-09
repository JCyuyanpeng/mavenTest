package com.maven10;

public class AnamilDemo {
    public static void main(String[] args) {
        Anamil a = new Anamil();
        a.method(new Jump() {
            @Override
            public void jump() {
                System.out.println("匿名函数");
            }
        });
    }
}
