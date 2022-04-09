package com.maven12;

public class StringInt {
    public static void main(String[] args) {
        int number = 100;
        String s = String.valueOf(number);
        System.out.println(s);
        Integer i = Integer.valueOf(s);
        int i2 = Integer.parseInt(s);
        System.out.println(i2);
        int i1 = i.intValue();
        System.out.println(i1);
    }
}
