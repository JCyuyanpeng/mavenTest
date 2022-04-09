package com.maven02;

import com.sun.xml.internal.ws.util.pipe.StandaloneTubeAssembler;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> s = new ArrayList<Student>();  //创建集合对象

        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(s);
                    break;
                case "2":
                    delStudent(s);
                    break;
                case "3":
                    setStudent(s);
                    break;
                case "4":
                    viewStudent(s);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生地址:");
        String address = sc.nextLine();
        Student s = new Student();  // 创建学生对象
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);   // 将学生对象添加到集合中
        System.out.println("添加学生成功");
    }

    public static void viewStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂无学生信息，先添加学生信息");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());

        }
    }

    public static void delStudent(ArrayList<Student> array) {
        System.out.println("输入删除学生的学号");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int index = -1;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getSid().equals(line)){
                index = x;
                break;
            }
        }
        if (index==-1){
            System.out.println("学生不存在，请重新输入");
        }else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

    }

    public static void setStudent(ArrayList<Student> array){
        System.out.println("要修改学生的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        System.out.println("修改学生的新姓名");
        String name = sc.nextLine();
        System.out.println("修改学生的新年龄");
        String age = sc.nextLine();
        System.out.println("修改学生的新地址");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int x=0; x<array.size(); x++){
            Student s2 = array.get(x);
            if (s2.getSid().equals(sid)){
                array.set(x,s);
                break;
            }
        }
        System.out.println("修改学生信息成功");
    }
}
