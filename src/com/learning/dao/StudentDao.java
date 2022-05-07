package com.learning.dao;

import com.learning.domain.Student;

import java.util.ArrayList;

public class StudentDao {
    public static ArrayList<Student> students=new ArrayList<>();
    //public Student[] students=new Student[5];


    public boolean addStudent(Student student) {

            students.add(student);
            return true;
    }

    public ArrayList<Student> displayStudent() {
        return students;
    }

    public boolean isExist(String id) {
        int index=-1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i)!=null&&students.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }
        if(index==-1){
            return false;
        }else {
            return true;
        }
    }

    public void deleteStudent(String id) {
        int index=-1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i)!=null&&students.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            students.remove(index);
        }
    }
}
