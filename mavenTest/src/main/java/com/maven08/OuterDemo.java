package com.maven08;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.Inter oi = new Outer().new Inter();
        oi.show();
        Outer o = new Outer();
        o.test();
    }
}
