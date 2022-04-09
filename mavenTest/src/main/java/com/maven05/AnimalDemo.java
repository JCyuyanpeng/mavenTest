package com.maven05;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping cat= new Cat();
        cat.jumpping();
        Animal cat1 = new Cat();
        cat1.ect();
        System.out.println("-------");

        Cat c = new Cat("加菲",5);
        c.jumpping();
        c.ect();
        System.out.println(c.getName() + "," + c.getAge());
    }
}
