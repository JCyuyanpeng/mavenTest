package com.maven08;

public class Outer {

    public class Inter{
        public void show(){
            System.out.println("hello");
        }
    }

    private class Show{
        public void print(){
            System.out.println("print hello");
        }
    }

    public void test(){
        Show show = new Show();
        show.print();
    }

}
