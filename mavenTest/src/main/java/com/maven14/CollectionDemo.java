package com.maven14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
//        System.out.println(c);
        Iterator<String> it = c.iterator(); //获取集合对象
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}