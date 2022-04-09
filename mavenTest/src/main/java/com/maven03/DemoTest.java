package com.maven03;

public class DemoTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(20);
        t.setName("tom");
        t.show();
        System.out.println(t.getName() + "," + t.getAge());
        Teacher t1 = new Teacher("jack", 90);
        t1.show();
        System.out.println(t1.getName() + "," + t1.getAge());

        Student s = new Student();
        s.setName("alex");
        s.setAge(30);
        s.show();

    }
}
