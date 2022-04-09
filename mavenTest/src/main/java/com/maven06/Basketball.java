package com.maven06;

public class Basketball extends Coach{

    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void etc() {
        System.out.println("吃饭");
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }

}
