package com.maven14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionStudentDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s = new Student();
        s.setName("tom");
        s.setAge("20");
        c.add(s);
        Student s1 = new Student("jack", "30");
        c.add(s1);
        Iterator<Student> ts = c.iterator();
        while (ts.hasNext()) {
            Student s3 = ts.next();
            System.out.println(s3.getName() + ", " + s3.getAge());
        }
        System.out.println("---------");
        for (Student stu: c){
            System.out.println(stu.getName()+ ", " + stu.getAge());
        }
    }
}
