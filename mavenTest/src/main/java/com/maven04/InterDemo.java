package com.maven04;

public class InterDemo {
    public static void main(String[] args) {
        InterfaceTest inter = new InterImpl();
        System.out.println(inter.num);
        System.out.println(inter.num1);
        inter.ect();
    }
}
