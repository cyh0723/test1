package com.learning.controller;

import com.learning.domain.Student;
import com.learning.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private StudentService studentService=new StudentService();

    public void start(){
        studentLoop:while (true){
            System.out.println("学生管理界面");
            System.out.println("选择：1、添加学生  2、删除学生  3、修改学生  4、查看学生  5.退出");
            Scanner sc=new Scanner(System.in);
            String choice=sc.next();
            switch (choice){
                case "1":
                    //system.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("修改学生");
                case "4":
                    //System.out.println("查看学生");
                    displayStudent();
                    break;
                case "5":
                    break studentLoop;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }

    }

    private void deleteStudent() {
        while(true){
            System.out.println("输入id：");
            Scanner sc=new Scanner(System.in);
            String id=sc.next();
            if(studentService.isExist(id)){
                studentService.deleteStudent(id);
                System.out.println("删除成功");
                return;
            }else {
                System.out.println("删除失败");

            }
        }
    }


    public void addStudent() {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入学生id：");
        String id=sc.next();
        System.out.println("输入学生name：");
        String name=sc.next();
        System.out.println("输入学生age：");
        String age=sc.next();

        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);


        boolean result=studentService.addStudent(student);
        if(result){
            System.out.println("添加成功");


        }else{
            System.out.println("添加失败");

        }

    }

    public void displayStudent() {
        //StudentService studentService=new StudentService();
        ArrayList<Student> stu=studentService.displayStudent();
        if(stu==null){
            System.out.println("查无信息");
            return;
        }else{
            for (int i = 0; i < stu.size(); i++) {
                System.out.println("学生id："+stu.get(i).getId()+" "+"学生姓名："+stu.get(i).getName()+" "+"学生年龄："+stu.get(i).getAge());

            }

        }

    }

}
