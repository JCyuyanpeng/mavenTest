package com.maven02;

public class NewPhone extends Phone{

    @Override   //注解，声明继承父类
    public void call(String name){
        System.out.println("开启视频");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
}