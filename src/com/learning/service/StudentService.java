package com.learning.service;

import com.learning.dao.StudentDao;
import com.learning.domain.Student;

import java.util.ArrayList;

public class StudentService {
    private StudentDao studentDao=new StudentDao();

    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public ArrayList<Student> displayStudent() {
        //StudentDao studentDao=new StudentDao();
        ArrayList<Student> stu=studentDao.displayStudent();
        return stu;
    }


    public boolean isExist(String id) {
        return studentDao.isExist(id);
    }

    public void deleteStudent(String id) {
        studentDao.deleteStudent(id);
    }
}
