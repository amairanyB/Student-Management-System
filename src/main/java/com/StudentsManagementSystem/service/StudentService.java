package com.StudentsManagementSystem.service;

import java.util.List;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

}
